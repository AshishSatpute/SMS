package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;


import pl.droidsonroids.gif.GifImageView;


public class SpashScreen extends AppCompatActivity {
    GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);
        gifImageView = findViewById(R.id.gif);
        gifImageView.setImageResource(R.drawable.animation);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Thread timerThread = new Thread() {
                public void run() {
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        if (getIntent().getStringExtra("BACK_PRESSED") != null) {
                            finish();
                        } else {
                            SpashScreen.this.runOnUiThread(new Runnable() {
                                public void run() {
                                    Intent intent = new Intent(SpashScreen.this, LoginActivity.class);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                    }
                }
            };
            timerThread.start();

        } else {
            startActivity(new Intent(SpashScreen.this, LoginActivity.class));
        }
    }
}