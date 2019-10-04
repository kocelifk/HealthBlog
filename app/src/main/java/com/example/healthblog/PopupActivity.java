package com.example.healthblog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class PopupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity);

        FragmentManager fragmentManager =getSupportFragmentManager();
        Fragment fragment=fragmentManager.findFragmentById(R.id.popup_activity_framelayout);
        if(fragment== null){
            fragment= PopupFragment.newInstance();
            fragmentManager.beginTransaction().add(R.id.popup_activity_framelayout,fragment).commit();
        }
    }

    public static Intent newIntent (Context context, FoodInfo foodInfo) {
        Intent intent = new Intent(context,PopupActivity.class);
        intent.putExtra("INFO", foodInfo);
        return intent;
    }
}