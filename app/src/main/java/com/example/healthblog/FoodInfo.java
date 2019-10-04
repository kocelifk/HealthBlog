package com.example.healthblog;
import android.os.Parcel;
import android.os.Parcelable;

public class FoodInfo implements Parcelable { //sınıf objesi olarak paylaşımı yapılacağı için
    private String foodName;
    private String foodDescription;
    private String foodImage;
    private String foodCalorie;

    public String getFoodName() {
        return foodName;
    }
    public String getFoodDescription() {
        return foodDescription;
    }
    public String getFoodImage() {
        return foodImage;
    }
    public String getFoodCalorie() {
        return foodCalorie;
    }

    public FoodInfo(String foodName, String foodDescription, String foodImage, String foodCalorie) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodImage = foodImage;
        this.foodCalorie = foodCalorie;
    }

    protected FoodInfo(Parcel in) {
        foodName=in.readString();
        foodDescription=in.readString();
        foodImage=in.readString();
        foodCalorie=in.readString();
    }

    public static final Creator<FoodInfo> CREATOR = new Creator<FoodInfo>() {
        @Override
        public FoodInfo createFromParcel(Parcel in) {
            return new FoodInfo(in);
        }

        @Override
        public FoodInfo[] newArray(int size) {
            return new FoodInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(foodName);
        dest.writeString(foodDescription);
        dest.writeString(foodImage);
        dest.writeString(foodCalorie);
    }
}
