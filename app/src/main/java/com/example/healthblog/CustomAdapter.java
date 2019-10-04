package com.example.healthblog;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Food> {
    private ArrayList<Food> foods;
    private Activity context;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view_food, null,true);

        TextView nameView = customView.findViewById(R.id.customTextView);
        nameView.setText(foods.get(position).getName());

        return customView;
    }

    public CustomAdapter(ArrayList<Food> foods, Activity context){
        super(context, R.layout.custom_view_food, foods);
        this.foods=foods;
        this.context=context;
    }
}