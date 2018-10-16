package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.admin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;


public class AdminDashboardFragment extends Fragment {


    public AdminDashboardFragment() {
        // Required empty public constructor
    }
    public static final String TAG=AdminDashboardFragment.class.getCanonicalName();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG, "onCreateView: AdminDashboardFragment");
        View view = inflater.inflate(R.layout.teacher_profile, container, false);
        return view;
    }

}
