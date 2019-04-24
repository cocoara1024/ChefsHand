package com.example.eatone;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EatRandom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_random);
    }

    private class MealsClass extends AsyncTask<Void, Void, List<Meals>> {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.themealdb.com/api/json/v1/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EatRandomService service = retrofit.create(EatRandomService.class);

        private ProgressDialog dialog = new ProgressDialog(EatRandom.this);

        protected void onPreExecute() {
            this.dialog.setMessage("Getting a perfect life advice for you!! Please Wait");
            this.dialog.show();
        }
        @Override
        protected List<Meals> doInBackground(Void... voids) {
            Call<Random> RandomCall = service.getRandom();
            try {
                Response<Random> MealResponse = RandomCall.execute();
                List<Meals> myMeal = MealResponse.body().getMeals();
                return myMeal;

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Meals> result) {
            TextView Meal = findViewById(R.id.menu);
            TextView Category = findViewById(R.id.category);
            TextView Tags = findViewById(R.id.tags);
            TextView Instructions = findViewById(R.id.Instructions);
            TextView Ingredient1 = findViewById(R.id.Ing1);
            TextView Ingredient2 = findViewById(R.id.Ing2);
            TextView Ingredient3 = findViewById(R.id.Ing3);
            TextView Ingredient4 = findViewById(R.id.Ing4);
            TextView Ingredient5 = findViewById(R.id.Ing5);
            TextView Ingredient6 = findViewById(R.id.Ing6);
            TextView Ingredient7 = findViewById(R.id.Ing7);
            TextView Ingredient8 = findViewById(R.id.Ing8);
            TextView Ingredient9 = findViewById(R.id.Ing9);
            TextView Ingredient10 = findViewById(R.id.Ing10);
            TextView Ingredient11 = findViewById(R.id.Ing11);
            TextView Ingredient12 = findViewById(R.id.Ing12);
            TextView Ingredient13 = findViewById(R.id.Ing13);
            TextView Ingredient14 = findViewById(R.id.Ing14);
            TextView Ingredient15 = findViewById(R.id.Ing15);
            TextView Ingredient16 = findViewById(R.id.Ing16);
            TextView Ingredient17 = findViewById(R.id.Ing17);
            TextView Ingredient18 = findViewById(R.id.Ing18);
            TextView Ingredient19 = findViewById(R.id.Ing19);
            TextView Ingredient20 = findViewById(R.id.Ing20);
            Meal.setText(result.get(0).getStrMeal());
            Category.setText(result.get(0).getStrCategory());
            Tags.setText(result.get(0).getStrTags());
            Instructions.setText(result.get(0).getStrInstructions());
            Ingredient1.setText(result.get(0).getStrIngredient1());
            Ingredient2.setText(result.get(0).getStrIngredient2());
            Ingredient3.setText(result.get(0).getStrIngredient3());
            Ingredient4.setText(result.get(0).getStrIngredient4());
            Ingredient5.setText(result.get(0).getStrIngredient5());
            Ingredient6.setText(result.get(0).getStrIngredient6());
            Ingredient7.setText(result.get(0).getStrIngredient7());
            Ingredient8.setText(result.get(0).getStrIngredient8());
            Ingredient9.setText(result.get(0).getStrIngredient9());
            Ingredient10.setText(result.get(0).getStrIngredient10());
            Ingredient11.setText(result.get(0).getStrIngredient11());
            Ingredient12.setText(result.get(0).getStrIngredient12());
            Ingredient13.setText(result.get(0).getStrIngredient13());
            Ingredient14.setText(result.get(0).getStrIngredient14());
            Ingredient15.setText(result.get(0).getStrIngredient15());
            Ingredient16.setText(result.get(0).getStrIngredient16());
            Ingredient17.setText(result.get(0).getStrIngredient17());
            Ingredient18.setText(result.get(0).getStrIngredient18());
            Ingredient19.setText(result.get(0).getStrIngredient19());
            Ingredient20.setText(result.get(0).getStrIngredient20());

            Instructions.setMovementMethod(new ScrollingMovementMethod());
            dialog.dismiss();
        }
    }

    public void launchMeal(View view) {
        MealsClass myMealsClass = new MealsClass();
        myMealsClass.execute();
    }
}
