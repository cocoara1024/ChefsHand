package com.example.eatone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void openTopActivity(View view) {
        Intent intent = new Intent(this, EatRecycler.class);
        startActivity(intent);
    }

    public void openRandomActivity(View view) {
        Intent intent = new Intent(this, EatRandom.class);
        startActivity(intent);
}
}
