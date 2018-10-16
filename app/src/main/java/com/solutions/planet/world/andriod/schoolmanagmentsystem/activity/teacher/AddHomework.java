package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class AddHomework extends AppCompatActivity {

    public static final String TAG=AddHomework.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_homework);
        context=AddHomework.this;
        Log.i(TAG, "onCreate: ");
    }
}
