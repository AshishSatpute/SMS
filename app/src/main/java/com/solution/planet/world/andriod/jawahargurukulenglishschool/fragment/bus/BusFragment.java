package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.bus;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

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
