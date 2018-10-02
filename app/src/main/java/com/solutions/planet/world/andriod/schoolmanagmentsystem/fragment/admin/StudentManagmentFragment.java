package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.admin;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.admin.AddStudent;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentManagmentFragment extends Fragment {


    FloatingActionButton floatingActionButton;
    public static final String TAG = StudentManagmentFragment.class.getCanonicalName();

    public StudentManagmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_student_manager, container, false);

        floatingActionButton =view.findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddStudent.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
