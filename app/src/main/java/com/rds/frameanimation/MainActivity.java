package com.rds.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable mTwitterAnimation;
    private ImageView mTwitterImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTwitterImageView = (ImageView) findViewById(R.id.picTwitID);
//        mTwitterImageView.setBackgroundResource(R.drawable.twitter_animation);

//        mTwitterAnimation = (AnimationDrawable) mTwitterImageView.getBackground();

//        mTwitterAnimation.start();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Handler animHandler = new Handler();
        animHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation startFading = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein_animation);
                mTwitterImageView.startAnimation(startFading);
//                mTwitterAnimation.stop();
            }
        }, 500); // run for 10 seconds
        return super.onTouchEvent(event);
    }



}
