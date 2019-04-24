package com.example.eatone;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EatRecycler extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;

    public int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_recycler);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        GetEatClass myEatClass = new GetEatClass();
        myEatClass.execute();

    }

    private class GetEatClass extends AsyncTask<Void, Void, List<Meal>> {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.themealdb.com/api/json/v1/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EatService service = retrofit.create(EatService.class);

        private ProgressDialog dialog = new ProgressDialog(EatRecycler.this);

        protected void onPreExecute() {
            this.dialog.setMessage("Loading food Categories. Please wait a moment");
            this.dialog.show();
        }

        @Override
        protected List<Meal> doInBackground(Void... voids) {
            Call<Eat> eatCall = service.getEat();

            try {
                Response<Eat> eatResponse = eatCall.execute();
                List<Meal> myList = eatResponse.body().getMeals();
                return myList;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Meal> result){
            mAdapter = new EatAdapter(result);
            recyclerView.setAdapter(mAdapter);
            dialog.dismiss();
        }
    }


}
