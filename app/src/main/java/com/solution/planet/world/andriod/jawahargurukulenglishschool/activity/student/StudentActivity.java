package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.ContactUs;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.student.StudentAttendanceFragment;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.student.StudentDashboardFragment;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.student.StudentProfileFragment;

public class StudentActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    public static final String TAG = StudentActivity.class.getCanonicalName();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        context = StudentActivity.this;
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

            case R.id.nav_log_out:
                finish();
                break;
            case R.id.nav_contact_us:
                startActivity(new Intent(context, ContactUs.class));
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onDestroy() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("homework", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove("homework");
        editor.commit();

        SharedPreferences pref1 = getApplicationContext().getSharedPreferences("msgData", 0);
        SharedPreferences.Editor editor1 = pref1.edit();
        editor1.remove("msgData");
        editor1.commit();


        SharedPreferences pref2 = getApplicationContext().getSharedPreferences("pick_up", 0);
        SharedPreferences.Editor editor2 = pref2.edit();
        editor2.remove("pick_up");
        editor2.commit();


        SharedPreferences pref3 = getApplicationContext().getSharedPreferences("attendance", 0);
        SharedPreferences.Editor editor3 = pref3.edit();
        editor3.remove("attendance");
        editor3.commit();

        super.onDestroy();
    }
}