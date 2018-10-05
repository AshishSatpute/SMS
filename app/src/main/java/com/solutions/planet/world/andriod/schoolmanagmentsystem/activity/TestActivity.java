package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    Dialog dialog;
    public static final String TAG=TestActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.i(TAG, "onCreate: ");

       // spinner = findViewById(R.id.sp);
       // spinner.setOnItemSelectedListener(TestActivity.this);

        List<String> categories = new ArrayList<>();
        categories.add("-- Select --");
        categories.add("Student");
        categories.add("Teacher");
        categories.add("Bus");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      //  spinner.setAdapter(dataAdapter);

        dialog = new Dialog(TestActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.add_class);
        dialog.setCancelable(true);
    }

    public void open(View view) {
        Log.i(TAG, "open: ");


     //   dialog.show();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
