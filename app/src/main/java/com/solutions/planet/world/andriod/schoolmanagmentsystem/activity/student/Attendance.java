package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;


public class Attendance extends AppCompatActivity {

    public static final String TAG=Attendance.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        Toolbar toolbar =  findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(R.string.attendance);
        ImageView mImageView = toolbar.findViewById(R.id.tvBack);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        context=Attendance.this;
        Log.i(TAG, "onCreate: ");

    }

}
