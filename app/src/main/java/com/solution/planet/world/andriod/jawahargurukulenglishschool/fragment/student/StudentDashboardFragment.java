package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.student;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.Attendance;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.BusPickUp;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.Event;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.EventGallery;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.Homework;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.Schedule;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.Syllabus;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.TeacherComment;


public class StudentDashboardFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = StudentDashboardFragment.class.getCanonicalName();
    Context context;
    public StudentDashboardFragment() {
    }

    CardView cvProfile, cvStudentHomWork, cvEvent, cvBusPickUp, cvAttendance, cvComment, cvSchedule, cvHomework, cvSyllabus, cvEventGallery;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_dashboard, container, false);
        Log.i(TAG, "onCreateView: ");

        cvAttendance = view.findViewById(R.id.cvAttendance);
        cvComment = view.findViewById(R.id.cvComment);
        cvSchedule = view.findViewById(R.id.cvSchedule);
        cvHomework = view.findViewById(R.id.cvHomework);
        cvSyllabus = view.findViewById(R.id.cvSyllabus);
        cvBusPickUp = view.findViewById(R.id.cvBusPickUp);
        cvEvent = view.findViewById(R.id.cvEvent);
        cvEventGallery = view.findViewById(R.id.cvEventGallery);

        cvAttendance.setOnClickListener(this);
        cvComment.setOnClickListener(this);
        cvSchedule.setOnClickListener(this);
        cvHomework.setOnClickListener(this);
        cvSyllabus.setOnClickListener(this);
        cvBusPickUp.setOnClickListener(this);
        cvEvent.setOnClickListener(this);
        cvEvent.setOnClickListener(this);
        cvEventGallery.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cvComment:
/*
                getFragmentManager().beginTransaction().replace(R.id.fragment_container_student, new StudentProfileFragment()).commit();
*/

                startActivity(new Intent(getActivity(), TeacherComment.class));
                break;

            case R.id.cvEvent:
                /*getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentEventFragment()).commit();*/
                startActivity(new Intent(getActivity(), Event.class));
                break;

            case R.id.cvEventGallery:
                /*getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentEventFragment()).commit();*/
                startActivity(new Intent(getActivity(), EventGallery.class));
                break;

            case R.id.cvAttendance:
               /* getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentAttendanceFragment()).commit();*/
                startActivity(new Intent(getActivity(), Attendance.class));

                break;

            case R.id.cvBusPickUp:
              /*  getFragmentManager().beginTransaction().replace(R.id.fragment_container_student, new
                        StudentBusPickUpFragment()).commit();*/
                startActivity(new Intent(getActivity(), BusPickUp.class));

                break;

            case R.id.cvSchedule:
              /*  getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentHomeworkFragment()).commit();*/
                startActivity(new Intent(getActivity(), Schedule.class));

                break;

            case R.id.cvHomework:
               /* getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentHomeworkFragment()).commit();*/
                startActivity(new Intent(getActivity(), Homework.class));

                break;
            case R.id.cvSyllabus:
                /*getFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentHomeworkFragment()).commit();*/
                startActivity(new Intent(getActivity(), Syllabus.class));

                break;

        }
    }
}
