package com.example.healthblog;

import android.app.Application;
import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //proje ile serverin  baglatısı için
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);//loglarda parse ın ne yazdıracağını görülmek istendiğinde
        Parse.initialize(new Parse.Configuration.Builder(this)
         .applicationId("CMmnCofa8TVTklRpDVDsnzdIeK3P62m4FFUMkNB7")
         .clientKey("2wN5uZXR9p9mniD1wSvEyR8LOYpD8pTRIcBUmYWM")
         .server("https://parseapi.back4app.com/")
         .build()
        );
    }
}
