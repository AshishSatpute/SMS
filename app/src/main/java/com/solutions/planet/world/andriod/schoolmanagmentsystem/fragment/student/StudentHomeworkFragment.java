package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student;


import android.content.Context;
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
public class StudentHomeworkFragment extends Fragment {

public static final String TAG = StudentHomeworkFragment.class.getCanonicalName();
Context context;
    public StudentHomeworkFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_homework, container, false);
        Log.i(TAG, "onCreateView: ");
        
        
        
        
        
        
        return view;
    }

}
