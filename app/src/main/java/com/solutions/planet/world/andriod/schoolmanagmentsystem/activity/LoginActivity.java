package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.admin.AdminActivity;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student.StudentActivity;

import java.util.ArrayList;
import java.util.List;


public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String TAG = LoginActivity.class.getCanonicalName();
    Context context;
    String item;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: ");
        context = LoginActivity.this;
        Spinner spinner = findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<>();
        categories.add("--Select--");
        categories.add("Admin");
        categories.add("Teacher");
        categories.add("Student");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        item = parent.getItemAtPosition(position).toString();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }

    public void btnLogin(View view) {
        Log.i(TAG, "btnLogin: chick");
        if (!item.isEmpty()) {
            if (item.contains("Admin"))
                startActivity(new Intent(this, AdminActivity.class));
            else if (item.contains("Student"))
                startActivity(new Intent(context, StudentActivity.class));
            else if (item.contains("Teacher"))
                startActivity(new Intent(context, TeacherActivity.class));
            else if (item.contains("--Select--")){
                Toast.makeText(context, "invalid user type", Toast.LENGTH_SHORT).show();
                }
        }

    }


}