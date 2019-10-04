package com.example.healthblog;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FoodPictureViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    ProgressBar progressBar;

    public FoodPictureViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.recyclerview_healthy_foods_list_imageview);
        progressBar = itemView.findViewById(R.id.recyclerview_healthy_foods_list_progressbar);
    }

    public void getFoods(Context context, FoodInfo foodInfo){
        itemView.setTag(foodInfo);
        Picasso.get().load(foodInfo.getFoodImage()).fit().centerCrop().into(imageView, new Callback() {
            @Override

            public void onSuccess() {
                progressBar.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {
            }
        });
    }
}