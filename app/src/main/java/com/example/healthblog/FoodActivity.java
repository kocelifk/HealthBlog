package com.example.healthblog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ListView listView  = findViewById(R.id.listView);

        Food bakla = new Food("Bakla","88 kcal" ,R.drawable.bakla);
        Food bamya = new Food("Bamya","33 kcal",R.drawable.bamya);
        Food bezelye = new Food("Bezelye","81 kcal",R.drawable.bezelye);
        Food biber = new Food("Biber","39.9 kcal",R.drawable.biber);
        Food brokoli = new Food("Brokoli","33.7 kcal",R.drawable.brokoli);
        Food domates = new Food("Domates","33 kcal",R.drawable.domates);
        Food enginar = new Food("Enginar","47.1 kcal",R.drawable.enginar);
        Food fasülye = new Food("Fasülye","347 kcal",R.drawable.fasulye);
        Food ıspanak = new Food("Ispanak","76 kcal",R.drawable.ispanak);
        Food kabak = new Food("Kabak","16.7 kcal",R.drawable.kabak);
        Food karnabahar = new Food("Karnabahar","24.9 kcal",R.drawable.karnabahar);
        Food kereviz = new Food("Kereviz","42 kcal",R.drawable.kereviz);
        Food kuskonmaz = new Food("Kuşkonmaz","20.3 kcal",R.drawable.kuskonmaz);
        Food lahana = new Food("Lahana","24.6 kcal",R.drawable.lahana);

        final ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(bakla);
        foodList.add(bamya);
        foodList.add(bezelye);
        foodList.add(biber);
        foodList.add(brokoli);
        foodList.add(domates);
        foodList.add(enginar);
        foodList.add(fasülye);
        foodList.add(ıspanak);
        foodList.add(kabak);
        foodList.add(karnabahar);
        foodList.add(kereviz);
        foodList.add(kuskonmaz);
        foodList.add(lahana);

        CustomAdapter customAdapter = new CustomAdapter(foodList, FoodActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FoodActivity.this,DetailsActivity.class);
                intent.putExtra("selectedFood", foodList.get(position));
                startActivity(intent);
            }
        });
    }
}
