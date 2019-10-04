package com.example.healthblog;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class FoodPictureAdapter extends RecyclerView.Adapter<FoodPictureViewHolder>implements View.OnClickListener {

    private ArrayList<FoodInfo> foodInfos;
    private LayoutInflater layoutInflater;
    private AppCompatActivity appCompatActivity;
    private MyListener myListener;

    public FoodPictureAdapter(AppCompatActivity appCompatActivity, MyListener myListener) {
        this.appCompatActivity = appCompatActivity;
        this.myListener = myListener;
        layoutInflater = appCompatActivity.getLayoutInflater();
        foodInfos = new ArrayList<>();
    }

    public ArrayList<FoodInfo> getFoodInfos() {
        return foodInfos;
    }

    @NonNull
    @Override
    public FoodPictureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listview = layoutInflater.inflate(R.layout.recyclerview_healthy_foods_list,viewGroup,false);
        listview.setOnClickListener(this);
        return new FoodPictureViewHolder(listview);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodPictureViewHolder foodPictureViewHolder, int i) {
        foodPictureViewHolder.getFoods(appCompatActivity,foodInfos.get(i));
    }

    @Override
    public int getItemCount() {
        return foodInfos.size();
    }

    @Override
    public void onClick(View v) {
        if(v.getTag() instanceof  FoodInfo){
            FoodInfo foodInfo = (FoodInfo) v.getTag();
            myListener.MyListener(foodInfo);
        }
    }

    public interface MyListener { //resimlerden birine tıklanıldığı durumda
        public void MyListener(FoodInfo foodInfo);
    }
}
