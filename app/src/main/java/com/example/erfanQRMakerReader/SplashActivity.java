package com.example.erfanQRMakerReader;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        EasySplashScreen splash = new EasySplashScreen(SplashActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
//                .withHeaderText("بارکد خوان و بارکد ساز")
//                .withFooterText("footer")
//                .withBeforeLogoText("befote")
//                .withAfterLogoText("Agter")
                .withLogo(R.drawable.ds);
        View RunSplash = splash.create();
        setContentView(RunSplash);
    }
}