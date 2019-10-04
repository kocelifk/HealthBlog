package com.example.healthblog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class FoodPictures extends AppCompatActivity implements FoodPictureAdapter.MyListener {

    private FoodPictureAdapter foodPictureAdapter;
    private RecyclerView recyclerView;
    private ArrayList<FoodInfo> foodInfos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_healthy_foods);

        foodPictureAdapter = new FoodPictureAdapter(FoodPictures.this,this);
        foodInfos=foodPictureAdapter.getFoodInfos();

        recyclerView = findViewById(R.id.fragment_heatlhy_foods_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(FoodPictures.this,2));
        recyclerView.setAdapter(foodPictureAdapter);

        getFoodInfos(foodInfos);
    }
    private ArrayList<FoodInfo>getFoodInfos(ArrayList<FoodInfo>foodInfos){
        foodInfos.add(new FoodInfo(
                "Havuç",
                "Vitamin: K, B, C",
                "https://iasbh.tmgrup.com.tr/e41e00/366/218/0/22/800/498?u=https://isbh.tmgrup.com.tr/sbh/2019/06/20/havuc-nedir-havucun-faydalari-nelerdir-1561030869859.jpg",
                "41.3 kcal"));
        foodInfos.add(new FoodInfo(
                "Elma",
                "Vitamin: A, B6, C, E",
                "https://cdn.bolgegundem.com/d/news/293597.jpg",
                "52.1 kcal"));
        foodInfos.add(new FoodInfo(
                "Kiraz",
                "Vitamin: A, C, B",
                "https://im.haberturk.com/2018/09/18/ver1537777798/2147359_810x458.jpg",
                "50 kcal"));
        foodInfos.add(new FoodInfo(
                "Böğürtlen",
                "Vitamin: B1, B2, B3",
                "https://cdn.yemek.com/mncrop/600/315/uploads/2015/12/meyve-kategorisi.jpg",
                "43.3 kcal"));
        foodInfos.add(new FoodInfo(
                "Kayısı",
                "Vitamin: A, B, C, E",
                "https://i.sozcu.com.tr/wp-content/uploads/2019/06/24/shutterstock_1138910816.jpg",
                "48 kcal"));
        foodInfos.add(new FoodInfo(
                "Kivi",
                "Vitamin: C, E",
                "https://foto.sondakika.com/haber/2018/01/15/kiviyi-ezip-dudaklariniza-surerseniz-10455767_o.jpg",
                "60.9 kcal"));
        foodInfos.add(new FoodInfo(
                "Nar",
                "Vitamin: C, B",
                "https://www.trthaber.com/resimler/364000/365760.jpg",
                "82.7 kcal"));
        foodInfos.add(new FoodInfo(
                "Erik",
                "Vitamin: B, C, E",
                "https://daac0riatyc2o.cloudfront.net/seyhanlar/products/8661/manav-erik-kg-yesil-041965001555941872.jpg",
                "19 kcal"));
        foodInfos.add(new FoodInfo(
                "Ananas",
                "Vitamin: B1, B6, C",
                "https://www.sosyolife.net/wp-content/uploads/2014/01/Diyet-Tatl%C4%B1-Tarifi.jpg",
                "50 kcal"));
        foodInfos.add(new FoodInfo(
                "İncir",
                "Vitamin: A, B1, B2",
                "https://www.anadoluetap.com/CMSFiles/Image/Content/636971028311290000.png",
                "48 kcal"));
        foodInfos.add(new FoodInfo(
                "Kavun",
                "Vitamin: A, B, C",
                "https://hthayat.haberturk.com/im/2013/06/14/ver1563877220/1014472_620x360.jpg",
                "33.7 kcal"));
        foodInfos.add(new FoodInfo(
                "Karpuz",
                "Vitamin: A, C",
                "https://iaahbr.tmgrup.com.tr/f58517/1200/627/0/4/800/422?u=https://iahbr.tmgrup.com.tr/2019/06/07/karpuz-secerken-uzerindeki-cizgilere-dikkat-video-1559921344373.jpg",
                "30.4 kcal"));
        foodInfos.add(new FoodInfo(
                "Şeftali",
                "Vitamin: C, E, K",
                "https://im.haberturk.com/2018/09/19/ver1537777998/2148592_810x458.jpg",
                "39.4 kcal"));
        foodInfos.add(new FoodInfo(
                "Üzüm",
                "Vitamin: A, B1, C",
                "https://im.haberturk.com/2018/09/26/ver1537993196/2157775_810x458.jpg",
                "66.9 kcal"));
        foodInfos.add(new FoodInfo(
                "Armut",
                "Vitamin: C, K",
                "https://foto.sondakika.com/haber/2018/07/25/yerli-tatli-armut-tezgahlarda-11083706_amp.jpg",
                "57.1 kcal"));
        foodInfos.add(new FoodInfo(
                "Mandalina",
                "Vitamin: A vitamin",
                "https://iasbh.tmgrup.com.tr/440a4c/752/395/0/20/575/322?u=https://isbh.tmgrup.com.tr/sbh/2018/10/01/mandalinanin-faydalari-nelerdir-mandalinanin-mucizevi-yararlari-1538399576484.jpg",
                "50 kcal"));
        foodInfos.add(new FoodInfo(
                "Mango",
                "Vitamin: C, B9, K",
                "https://cdn.apartmenttherapy.info/image/fetch/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_1:1/https%3A%2F%2Fstorage.googleapis.com%2Fgen-atmedia%2F3%2F2012%2F02%2F1052a69418e81bac5e0a10cb83ea1e3fc3ed0c50.jpeg",
                "59. 8 kcal"));
        foodInfos.add(new FoodInfo(
                "Avakado",
                "Vitamin: B2, B3, B6",
                "https://www.helalplatform.com/wp-content/uploads/2018/05/avakado_ka%C3%A7_kalori_.jpg",
                "160.1 kcal"));
        return foodInfos;
    }
    @Override
    public void MyListener(FoodInfo foodInfo) {
        Intent intent= PopupActivity.newIntent(FoodPictures.this,foodInfo);
        startActivity(intent);
    }
}
