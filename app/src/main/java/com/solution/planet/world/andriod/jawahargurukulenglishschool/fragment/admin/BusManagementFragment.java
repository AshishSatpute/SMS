package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.admin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusManagementFragment extends Fragment {


    public BusManagementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bus_management, container, false);
        return view;
    }

}
