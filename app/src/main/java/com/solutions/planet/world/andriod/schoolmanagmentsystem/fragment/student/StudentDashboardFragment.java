package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;


public class StudentDashboardFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = StudentDashboardFragment.class.getCanonicalName();

    public StudentDashboardFragment() {
        // Required empty public constructor
    }

    CardView cvProfile, cvStudentHomWork, cvEvent, cvBusPickUp, cvAttendance;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_dashboard, container, false);

        cvProfile = view.findViewById(R.id.cvProfile);
        cvStudentHomWork = view.findViewById(R.id.cvStudentHomWork);
        cvEvent = view.findViewById(R.id.cvEvent);
        cvBusPickUp = view.findViewById(R.id.cvBusPickUp);
        cvAttendance = view.findViewById(R.id.cvAttendance);

        cvProfile.setOnClickListener(this);
        cvStudentHomWork.setOnClickListener(this);
        cvEvent.setOnClickListener(this);
        cvBusPickUp.setOnClickListener(this);
        cvAttendance.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.cvProfile:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,new StudentProfileFragment()).commit();
                break;

            case R.id.cvEvent:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentEventFragment()).commit();
                break;

            case R.id.cvAttendance:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentAttendanceFragment()).commit();
                break;

            case R.id.cvBusPickUp:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,new
                        StudentBusPickUpFragment()).commit();
                break;

            case R.id.cvStudentHomWork:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentHomeworkFragment()).commit();
                break;
        }
    }
}
