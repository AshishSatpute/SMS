package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class Homework extends AppCompatActivity {

    public static final String TAG=Homework.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
        context = Homework.this;
        Log.i(TAG, "onCreate: ");

    }
}
