package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;


public class Attendance extends AppCompatActivity {

    public static final String TAG = Attendance.class.getCanonicalName();
    Context context;
    View include1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        Toolbar toolbar = findViewById(R.id.toolbar); // get the reference of Toolbar
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
        context = Attendance.this;
        Log.i(TAG, "onCreate: ");

        SharedPreferences pref = getApplicationContext().getSharedPreferences("attendance", 0);
        Boolean b = pref.getBoolean("attendance", false);
        include1 = findViewById(R.id.include1);

        if (b.booleanValue() == true) {
            include1.setVisibility(View.VISIBLE);
            TextView data = include1.findViewById(R.id.date1);
            data.setText("January 19 2019 Saturday");

        } else {
            include1.setVisibility(View.GONE);
        }


    }

}
