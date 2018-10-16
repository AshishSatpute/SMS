package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.bus;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class BusFragment extends AppCompatActivity {
    public static final String TAG = BusFragment.class.getCanonicalName();
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_bus);
        context = BusFragment.this;
        Log.i(TAG, "onCreate: ");
    }
}
