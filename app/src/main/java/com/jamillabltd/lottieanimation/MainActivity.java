package com.jamillabltd.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set gif
        LottieAnimationView lottieView = findViewById(R.id.lottieAnimationViewId);
        lottieView.setAnimation(R.raw.privacy_animatioin);
        //lottieView.playAnimation();
        //lottieView.loop(true);

    }
}