package com.acoulson.grabilitytest;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public static final int STARTUP_DELAY = 300;
    public static final int ANIM_ITEM_DURATION = 1000;
    public static final int EDITTEXT_DELAY = 300;
    public static final int BUTTON_DELAY = 500;
    public static final int VIEW_DELAY = 400;
    private static final long SPLASH_SCREEN_DELAY = 5000;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.title);

        ImageView imageView;

        Typeface typo = Typeface.createFromAsset(this.getAssets(), "CFGhostStories-Regular.ttf");

        textView.setTypeface(typo);


        ViewCompat.animate(textView)
                .translationY(-280)
                .setStartDelay(STARTUP_DELAY)
                .setDuration(ANIM_ITEM_DURATION).setInterpolator(
                new DecelerateInterpolator(1.2f)).start();


        TimerTask task = new TimerTask() {

            @Override
            public void run() {



                startActivity(new Intent(MainActivity.this, StartActivity.class));
                finish();

            }



        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);

    }



}


