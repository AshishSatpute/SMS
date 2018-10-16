package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.bus.BusActivity;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student.StudentActivity;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher.TeacherActivity;

import java.util.ArrayList;
import java.util.List;


public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String TAG = LoginActivity.class.getCanonicalName();
    Context context;
    String item;
    EditText etUserName, etPassword;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = LoginActivity.this;
        Log.i(TAG, "onCreate: ");
        Spinner spinner = findViewById(R.id.spinner);
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);

        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<>();
        categories.add("-- Select --");
        categories.add("Parent");
        categories.add("Teacher");
        categories.add("Bus");
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
        if (!item.isEmpty()) {
            if (item.contains("Parent"))
                validationParent();
            else if (item.contains("Teacher"))
                validationTeacher();
            else if (item.contains("-- Select --"))
                validation();
            else if (item.contains("Bus"))
                validationBus();
        }
    }

    private void validation() {
        if (item.contains("-- Select --"))
            Toast.makeText(context, "Please select user type", Toast.LENGTH_SHORT).show();
        clearText();
    }

    private void validationBus() {
        if (item.contains("Bus") && !getEtUserName().isEmpty() && !getEtPassword().isEmpty()) {
            startActivity(new Intent(context, BusActivity.class));
            clearText();
        } else {
            clearText();
            Toast.makeText(context, "Invalid UserId And Password", Toast.LENGTH_SHORT).show();
        }
    }

    private void validationTeacher() {
        if (item.contains("Teacher") && !getEtUserName().isEmpty() && !getEtPassword().isEmpty()) {
            startActivity(new Intent(context, TeacherActivity.class));
            clearText();
        } else {
            Toast.makeText(context, "Invalid UserId And Password", Toast.LENGTH_SHORT).show();
            clearText();
        }
    }

    private void validationParent() {
        if (item.contains("Parent") && !getEtUserName().isEmpty() && !getEtPassword().isEmpty()) {
            startActivity(new Intent(context, StudentActivity.class));
            clearText();
        } else {
            Toast.makeText(context, "Invalid UserId And Password", Toast.LENGTH_SHORT).show();
            clearText();
        }
    }

    public String getEtUserName() {
        return etUserName.getText().toString().trim();
    }

    public String getEtPassword() {
        return etPassword.getText().toString().trim();
    }

    public void clearText() {
        etUserName.setText("");
        etPassword.setText("");
    }
}