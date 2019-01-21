package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.student;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentAttendanceFragment extends Fragment {

public static final String TAG = StudentAttendanceFragment.class.getCanonicalName();
Context context;
    public StudentAttendanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student_attendance, container, false);
        Log.i(TAG, "onCreateView: ");
        
        return view;
    }

}
