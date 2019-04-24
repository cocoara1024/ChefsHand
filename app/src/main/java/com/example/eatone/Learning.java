package com.example.eatone;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Learning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        Intent intent = getIntent();

        TextView Name = findViewById(R.id.menu);
//        ImageView imageView = findViewById(R.id.imageView);
        TextView category = findViewById(R.id.category);
        TextView Instructions = findViewById(R.id.Instructions);
        TextView Tags = findViewById(R.id.tags);
        TextView Ing1 = findViewById(R.id.Ing1);
        TextView Ing2 = findViewById(R.id.Ing2);
        TextView Ing3 = findViewById(R.id.Ing3);
        TextView Ing4 = findViewById(R.id.Ing4);
        TextView Ing5 = findViewById(R.id.Ing5);
        TextView Ing6 = findViewById(R.id.Ing6);
        TextView Ing7 = findViewById(R.id.Ing7);
        TextView Ing8 = findViewById(R.id.Ing8);
        TextView Ing9 = findViewById(R.id.Ing9);
        TextView Ing10 = findViewById(R.id.Ing10);
        TextView Ing11 = findViewById(R.id.Ing11);
        TextView Ing12 = findViewById(R.id.Ing12);
        TextView Ing13 = findViewById(R.id.Ing13);
        TextView Ing14 = findViewById(R.id.Ing14);
        TextView Ing15 = findViewById(R.id.Ing15);
        TextView Ing16 = findViewById(R.id.Ing16);
        TextView Ing17 = findViewById(R.id.Ing17);
        TextView Ing18 = findViewById(R.id.Ing18);
        TextView Ing19 = findViewById(R.id.Ing19);
        TextView Ing20 = findViewById(R.id.Ing20);


        Instructions.setMovementMethod(new ScrollingMovementMethod());

        setTitle(intent.getStringExtra("MENU"));

        Name.setText(intent.getStringExtra("MENU"));
//        imageView.setImageIcon(Icon.createWithContentUri(intent.getStringExtra("IMAGE")));
        Instructions.setText(intent.getStringExtra("INSTRUCTIONS"));
        category.setText(intent.getStringExtra("CATEGORY"));
        Tags.setText(intent.getStringExtra("TAGS"));
        Ing1.setText(intent.getStringExtra("INGREDIENT1"));
        Ing2.setText(intent.getStringExtra("INGREDIENT2"));
        Ing3.setText(intent.getStringExtra("INGREDIENT3"));
        Ing4.setText(intent.getStringExtra("INGREDIENT4"));
        Ing5.setText(intent.getStringExtra("INGREDIENT5"));
        Ing6.setText(intent.getStringExtra("INGREDIENT6"));
        Ing7.setText(intent.getStringExtra("INGREDIENT7"));
        Ing8.setText(intent.getStringExtra("INGREDIENT8"));
        Ing9.setText(intent.getStringExtra("INGREDIENT9"));
        Ing10.setText(intent.getStringExtra("INGREDIENT10"));
        Ing11.setText(intent.getStringExtra("INGREDIENT11"));
        Ing12.setText(intent.getStringExtra("INGREDIENT12"));
        Ing13.setText(intent.getStringExtra("INGREDIENT13"));
        Ing14.setText(intent.getStringExtra("INGREDIENT14"));
        Ing15.setText(intent.getStringExtra("INGREDIENT15"));
        Ing16.setText(intent.getStringExtra("INGREDIENT16"));
        Ing17.setText(intent.getStringExtra("INGREDIENT17"));
        Ing18.setText(intent.getStringExtra("INGREDIENT18"));
        Ing19.setText(intent.getStringExtra("INGREDIENT19"));
        Ing20.setText(intent.getStringExtra("INGREDIENT20"));

    }

    }
