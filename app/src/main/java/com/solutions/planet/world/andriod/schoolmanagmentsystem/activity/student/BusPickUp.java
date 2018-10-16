package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class BusPickUp extends AppCompatActivity {
public static final String TAG=BusPickUp.class.getCanonicalName();
Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_pick_up);
        Toolbar toolbar =  findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
        // Setting/replace toolbar as the ActionBar
        context=BusPickUp.this;
        Log.i(TAG, "onCreate: ");
    }
}
