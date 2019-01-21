package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class Homework extends AppCompatActivity {

    public static final String TAG = Homework.class.getCanonicalName();
    Context context;
    View includeHW;
    TextView tvHW;
    TextView tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
        context = Homework.this;
        Toolbar toolbar = findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(R.string.homework);
        ImageView mImageView = toolbar.findViewById(R.id.tvBack);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Log.i(TAG, "onCreate: ");

        //SharePref
        includeHW = findViewById(R.id.includeHW);
        tvHW = includeHW.findViewById(R.id.tvHW);
        tvDate = includeHW.findViewById(R.id.tvDate);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("homework", 0);
        if (TextUtils.isEmpty(pref.getString("homework", null))) {
            includeHW.setVisibility(View.GONE);
        } else {
            includeHW.setVisibility(View.VISIBLE);
            tvHW.setText(pref.getString("homework", null));
            tvDate.setText("19/01/2018");
        }

    }
}
