package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.teacher.AttendnaceList;

public class AttendanceListCollector extends AppCompatActivity {


    public static final String TAG = AttendanceListCollector.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_list_collector);
        context = AttendanceListCollector.this;
        Log.i(TAG, "onCreate: ");
        getSupportActionBar().setTitle(R.string.student_list);

        Log.i(TAG, "onCreate: ");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                    new AttendnaceList()).commit();
        }
    }
}
