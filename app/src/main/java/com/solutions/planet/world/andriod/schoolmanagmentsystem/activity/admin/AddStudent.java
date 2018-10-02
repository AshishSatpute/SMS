package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class AddStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }

    public void save(View view) {
        finish();
    }
}
