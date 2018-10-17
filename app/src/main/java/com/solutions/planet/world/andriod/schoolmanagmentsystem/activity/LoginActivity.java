package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.bus.BusActivity;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student.StudentActivity;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher.TeacherActivity;


import static com.solutions.planet.world.andriod.schoolmanagmentsystem.R.*;


public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String TAG = LoginActivity.class.getCanonicalName();
    Context context;
    String item;
    EditText etUserName, etPassword;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        context = LoginActivity.this;
        Log.i(TAG, "onCreate: ");
        Spinner spinner = findViewById(id.spinner);
        etUserName = findViewById(id.etUserName);
        etPassword = findViewById(id.etPassword);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_spinner_item, getResources().getStringArray(array.catagery));
        dataAdapter.setDropDownViewResource(layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void validationBus() {
        if (item.contains("Bus")) {
            if (getEtUserName().isEmpty()) {
                etUserName.setError("invalid userId");
                return;
            }
            if (getEtPassword().isEmpty()) {
                etPassword.setError("invalid password");
                clearText();
            } else startActivity(new Intent(context, BusActivity.class));
        }
    }

    private void validationTeacher() {
        if (item.contains("Teacher")) {
            if (getEtUserName().isEmpty()) {
                etUserName.setError("invalid userId");
                return;
            }
            if (getEtPassword().isEmpty()) {
                etPassword.setError("invalid password");
                clearText();
            } else startActivity(new Intent(context, TeacherActivity.class));
        }
    }

    private void validationParent() {
        if (item.contains("Parent")) {
            if (getEtUserName().isEmpty()) {
                etUserName.setError("invalid userId");
                return;
            }
            if (getEtPassword().isEmpty()) {
                etPassword.setError("invalid password");
                clearText();
            } else startActivity(new Intent(context, StudentActivity.class));
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