package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.bus;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;


public class BusHomeFragment extends Fragment {

    public static final String TAG = BusHomeFragment.class.getCanonicalName();
    Context context;

    public BusHomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bus_home, container, false);
        Log.i(TAG, "onCreateView: ");


        return view;
    }

}
