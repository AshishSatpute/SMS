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

public class BusPickUp extends AppCompatActivity {
    public static final String TAG = BusPickUp.class.getCanonicalName();
    private Context context;
    private View includeBus;
    private TextView date, tvOutTimeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_pick_up);
        Toolbar toolbar = findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(R.string.bus_pick_up);
        ImageView mImageView = toolbar.findViewById(R.id.tvBack);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        context = BusPickUp.this;
        Log.i(TAG, "onCreate: ");

        //sharePref
        includeBus = findViewById(R.id.includeBus);
        date = includeBus.findViewById(R.id.date);
        tvOutTimeData = includeBus.findViewById(R.id.tvOutTimeData);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("pick_up", 0);
        if (TextUtils.isEmpty(pref.getString("pick_up", null))) {
            includeBus.setVisibility(View.GONE);
        } else {
            includeBus.setVisibility(View.VISIBLE);
            date.setText("19/01/2019");
            if (pref.getString("pick_up", null).contains("pick")) {
                tvOutTimeData.setVisibility(View.GONE);
            } else {
                date.setText("19/01/2019");
                tvOutTimeData.setVisibility(View.VISIBLE);
            }
        }

    }
}
