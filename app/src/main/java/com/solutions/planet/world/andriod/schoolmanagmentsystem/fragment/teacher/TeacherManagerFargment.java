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
public class TeacherManagerFargment extends Fragment {


    public TeacherManagerFargment() {
    }

    public static final String TAG = TeacherManagerFargment.class.getCanonicalName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: TeacherManagerFargment");
        View view= inflater.inflate(R.layout.fragment_teachermanager_fargment, container, false);
        return view;
    }

}
