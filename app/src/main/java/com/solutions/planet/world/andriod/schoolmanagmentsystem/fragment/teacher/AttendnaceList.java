package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.teacher;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttendnaceList extends Fragment {

    public static final String TAG = AttendnaceList.class.getCanonicalName();


    public AttendnaceList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_attendnace_list, container, false);
        Log.i(TAG, "onCreateView: ");


        return view;
    }

}
