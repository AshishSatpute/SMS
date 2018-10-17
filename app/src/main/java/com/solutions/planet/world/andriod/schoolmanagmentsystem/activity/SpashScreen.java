package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);



        Thread timerThread = new Thread() {
            public void run() {
                try {
                    //todo change this tym
                    sleep(2000);
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

    }

}

