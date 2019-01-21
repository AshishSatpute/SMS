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
public class StudentProfileFragment extends Fragment {

public static final String TAG = StudentProfileFragment.class.getCanonicalName();
Context context;
    public StudentProfileFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_student_profile, container, false);
        Log.i(TAG, "onCreateView: ");





        return view;
    }

}
