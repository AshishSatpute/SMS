package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student.StudentAttendanceFragment;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student.StudentBusPickUpFragment;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student.StudentDashboardFragment;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student.StudentEventFragment;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student.StudentHomeworkFragment;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment.student.StudentProfileFragment;

public class StudentActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    public static final String TAG = StudentActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Log.i(TAG, "onCreate: ");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.adminDrawerlayout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        if (savedInstanceState == null) {
            Log.i(TAG, "onCreate: savedInstanceState");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                    new StudentDashboardFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_dashboard);
        }
    }

    @Override
    public void onBackPressed() {
        Log.i(TAG, "onBackPressed: ");
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.i(TAG, "onNavigationItemSelected: ");
        switch (item.getItemId()) {
            case R.id.nav_dashboard:
                Log.i(TAG, "onNavigationItemSelected: chick dashboard");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentDashboardFragment()).commit();
                break;
            case R.id.nav_stuent_profile:
                Log.i(TAG, "onNavigationItemSelected: chick nav_student_attendace");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentProfileFragment()).commit();
                break;
            case R.id.nav_student_attendace:
                Log.i(TAG, "onNavigationItemSelected: chick nav_student_attendace");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentAttendanceFragment()).commit();
                break;
            case R.id.nav_student_event:
                Log.i(TAG, "onNavigationItemSelected: chick nav_student_event");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentEventFragment()).commit();
                break;

            case R.id.nav_student_bus_pick_up:
                Log.i(TAG, "onNavigationItemSelected: chick nav_student_event");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentBusPickUpFragment()).commit();
                break;
            case R.id.nav_student_homework:
                Log.i(TAG, "onNavigationItemSelected: chick nav_student_event");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_student,
                        new StudentHomeworkFragment()).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
