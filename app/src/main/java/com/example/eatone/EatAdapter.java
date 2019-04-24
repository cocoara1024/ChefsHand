package com.example.eatone;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class EatAdapter extends RecyclerView.Adapter<EatAdapter.EatViewHolder> {

    private List<Meal> mDataset;
//    private Context mcontext;

    public EatAdapter(List<Meal> myDataset) {
        mDataset = myDataset;
    }

    public class EatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView menu;
        public ImageView image;
        public Button PressButton;
//        public CardView cardView;

        public EatViewHolder(View itemView){
            super(itemView);
            menu = itemView.findViewById(R.id.menu);
            image = itemView.findViewById(R.id.image);
            PressButton = itemView.findViewById(R.id.PressButton);
//            cardView = itemView.findViewById(R.id.view);

            PressButton.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Meal meal = mDataset.get(position);

            String menu = meal.getStrMeal();
            String category = meal.getStrCategory();
            String tags = meal.getStrTags();
            String Instructions = meal.getStrInstructions();
            String Ing1 = meal.getStrIngredient1();
            String Ing2 = meal.getStrIngredient2();
            String Ing3 = meal.getStrIngredient3();
            String Ing4 = meal.getStrIngredient4();
            String Ing5 = meal.getStrIngredient5();
            String Ing6 = meal.getStrIngredient6();
            String Ing7 = meal.getStrIngredient7();
            String Ing8 = meal.getStrIngredient8();
            String Ing9 = meal.getStrIngredient9();
            String Ing10 = meal.getStrIngredient10();
            String Ing11 = meal.getStrIngredient11();
            String Ing12 = meal.getStrIngredient12();
            String Ing13 = meal.getStrIngredient13();
            String Ing14 = meal.getStrIngredient14();
            String Ing15 = meal.getStrIngredient15();
            String Ing16 = meal.getStrIngredient16();
            String Ing17 = meal.getStrIngredient17();
            String Ing18 = meal.getStrIngredient18();
            String Ing19 = meal.getStrIngredient19();
            String Ing20 = meal.getStrIngredient20();


            Intent intent = new Intent(itemView.getContext(), Learning.class);

            intent.putExtra("MENU", menu);
            intent.putExtra("CATEGORY", category);
            intent.putExtra("TAGS", tags);
            intent.putExtra("INSTRUCTIONS", Instructions);
            intent.putExtra("INGREDIENT1", Ing1);
            intent.putExtra("INGREDIENT2", Ing2);
            intent.putExtra("INGREDIENT3", Ing3);
            intent.putExtra("INGREDIENT4", Ing4);
            intent.putExtra("INGREDIENT5", Ing5);
            intent.putExtra("INGREDIENT6", Ing6);
            intent.putExtra("INGREDIENT7", Ing7);
            intent.putExtra("INGREDIENT8", Ing8);
            intent.putExtra("INGREDIENT9", Ing9);
            intent.putExtra("INGREDIENT10", Ing10);
            intent.putExtra("INGREDIENT11", Ing11);
            intent.putExtra("INGREDIENT12", Ing12);
            intent.putExtra("INGREDIENT13", Ing13);
            intent.putExtra("INGREDIENT14", Ing14);
            intent.putExtra("INGREDIENT15", Ing15);
            intent.putExtra("INGREDIENT16", Ing16);
            intent.putExtra("INGREDIENT17", Ing17);
            intent.putExtra("INGREDIENT18", Ing18);
            intent.putExtra("INGREDIENT19", Ing19);
            intent.putExtra("INGREDIENT20", Ing20);

            itemView.getContext().startActivity(intent);
        }

    }

    @Override
    public EatAdapter.EatViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View eatView = LayoutInflater.from(parent.getContext()).inflate(R.layout.eat_item, parent, false);
        EatViewHolder vh = new EatViewHolder(eatView);
        return vh;
    }

    @Override
    public void onBindViewHolder(EatViewHolder holder, int position){
        holder.menu.setText(mDataset.get(position).getStrMeal());
//        holder.image.setImageUrl(mDataset.get(position).getStrCategoryThumb());
//        Picasso.with(mcontext).load(imageurl).fit().centerInside().into(holder.image);
//        holder.cardView.setCardBackgroundColor(Color.argb(255,204,153,255));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
    }