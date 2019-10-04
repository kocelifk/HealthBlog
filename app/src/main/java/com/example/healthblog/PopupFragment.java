package com.example.healthblog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class PopupFragment extends Fragment {
    TextView nameText;
    TextView descriptionText;
    TextView calorieText;
    ImageView imageView;
    ProgressBar progressBar;
    private FoodInfo foodInfo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_popup,container,false);

        nameText = rootView.findViewById(R.id.fragment_popup_name_textview);
        descriptionText = rootView.findViewById(R.id.fragment_popup_description_textview);
        calorieText = rootView.findViewById(R.id.fragment_popup_calorie_textview);
        imageView= rootView.findViewById(R.id.fragment_popup_imageview);
        progressBar= rootView.findViewById(R.id.fragment_popup_progressbar);

        nameText.setText(foodInfo.getFoodName());
        descriptionText.setText(foodInfo.getFoodDescription());
        calorieText.setText(""+foodInfo.getFoodCalorie());

        Picasso.get().load(foodInfo.getFoodImage()).fit().centerCrop().into(imageView, new Callback() {

            @Override
            public void onSuccess() {
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
            }
        });
        return rootView;
    }

    public static PopupFragment newInstance(){
        return new PopupFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodInfo=getActivity().getIntent().getParcelableExtra("INFO");
    }
}
