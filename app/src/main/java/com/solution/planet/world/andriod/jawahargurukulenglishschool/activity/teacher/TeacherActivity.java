package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.ContactUs;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.admin.AdminDashboardFragment;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.admin.StudentManagmentFragment;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.teacher.TeacherHomeFragment;

public class TeacherActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    Context context;
    public static final String TAG = TeacherActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = TeacherActivity.this;
        Log.i(TAG, "onCreate: ");
        setContentView(R.layout.activity_teacher);
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
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new TeacherHomeFragment()).commit();
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
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AdminDashboardFragment()).commit();
                break;
            case R.id.nav_student_management:
                Log.i(TAG, "onNavigationItemSelected: chick manager");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new StudentManagmentFragment()).commit();
                /*startActivity(new Intent(this,AddStudent.class));*/
                break;

            case R.id.nav_log_out:
                finish();
                break;
            case R.id.nav_contact_us:
                startActivity(new Intent(context, ContactUs.class));
                break;
          /*  case R.id.nav_teacher_management:
                Log.i(TAG, "onNavigationItemSelected: chick teacher manager");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new TeacherManagerFargment()).commit();
                break;
            case R.id.nav_bus_management:
                Log.i(TAG, "onNavigationItemSelected: chick teacher manager");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new BusManagementFragment()).commit();
                break;

            case R.id.nav_cost_management:
                Log.i(TAG, "onNavigationItemSelected: chick teacher manager");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CostManagmentFragment()).commit();
                break;*/
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}