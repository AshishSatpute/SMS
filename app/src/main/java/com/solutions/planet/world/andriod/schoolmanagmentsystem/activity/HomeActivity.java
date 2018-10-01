package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class HomeActivity extends AppCompatActivity {

    public static final String TAG = HomeActivity.class.getCanonicalName();
    TextView textView;

    String ActivityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.i(TAG, "onCreate: ");

        Intent intent = getIntent();
        ActivityName = intent.getStringExtra("ActivityName");
        Log.i(TAG, "onCreate: ActivityName:" + ActivityName);


        /*if (!ActivityName.isEmpty()) {
            Log.i(TAG, "onCreate: not emply" + ActivityName);
            if (ActivityName.contains("AdminActivity")) {
                loadFragment(AdminActivity.getInstance());
            } else if (ActivityName.contains("Teacher")) {
                Log.i(TAG, "onCreate: Teacher select");
                loadFragment(Teacher.getInstance());

            } else if (ActivityName.contains("Student")) {

                Log.i(TAG, "onCreate: Studnet select");

                loadFragment(Student.getInstance());
            }
        }*/

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void loadFragment(Fragment fragment) {
        String backStateName = fragment.getClass().getName();
        FragmentManager fragmentManager = getSupportFragmentManager();
        boolean fragmentPopped = fragmentManager.popBackStackImmediate(backStateName, 0);
        if (!fragmentPopped) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment);
            fragmentTransaction.addToBackStack(backStateName);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
