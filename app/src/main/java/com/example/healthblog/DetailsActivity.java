package com.example.healthblog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.imageView);
        TextView nameText = findViewById(R.id.nameText);
        TextView descriptionText = findViewById(R.id.descriptionText);

        Intent intent = getIntent();
        Food selectedFood= (Food)intent.getSerializableExtra("selectedFood");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedFood.getPictureInteger());
        imageView.setImageBitmap(bitmap);

        nameText.setText(selectedFood.getName());
        descriptionText.setText(selectedFood.getDescription());
    }
}