package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.admin.AdminDashboardFragment;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.teacher.AttendnaceList;

public class AttendanceListCollector extends AppCompatActivity {


    public static final String TAG = AttendanceListCollector.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_list_collector);
      //  getActionBar().setTitle("Student List");
        getSupportActionBar().setTitle("Student List");

        Log.i(TAG, "onCreate: ");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                    new AttendnaceList()).commit();

        }

    }
}
