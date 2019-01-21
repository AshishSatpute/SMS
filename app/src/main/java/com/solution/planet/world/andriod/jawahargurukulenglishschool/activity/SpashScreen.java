package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);
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