package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

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
