package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
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
    public static final String TAG = TestActivity.class.getCanonicalName();
    AlertDialog.Builder builder;
    List<String> categories;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.i(TAG, "onCreate: ");
context = TestActivity.this;
        // spinner = findViewById(R.id.sp);
        // spinner.setOnItemSelectedListener(TestActivity.this);

 categories = new ArrayList<>();
        categories.add("-- Select --");
        categories.add("Student");
        categories.add("Teacher");
        categories.add("Bus");
      /*  ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //  spinner.setAdapter(dataAdapter);

        dialog = new Dialog(TestActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.add_class);
        dialog.setCancelable(true);*/






      
    }


    public void open(final Context context) {
        builder = new AlertDialog.Builder(context);
        builder.setTitle("select std");
        LayoutInflater inflater =(LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View view1 =  inflater.inflate(R.layout.dailog_spinner, null);
        builder.setView(view1);
        builder.setTitle("Select Std");
        final Spinner spinner = view1.findViewById(R.id.spinner1);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.std_lists));
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String data = spinner.getSelectedItem().toString();
                Toast.makeText(context, "" + data, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create();
        builder.show();

    }

    public void open(View view) {
        Log.i(TAG, "open: ");

     /*   AlertDialog alertDialog = builder.create();
        alertDialog.show();*/
        //   dialog.show();






              builder = new AlertDialog.Builder(context);
        builder.setTitle("select std");
        LayoutInflater inflater =(LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.dailog_spinner, null);
        builder.setView(view1);
        builder.setTitle("Select Std");
        final Spinner spinner = view1.findViewById(R.id.spinner1);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(TestActivity.this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.std_lists));
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String data = spinner.getSelectedItem().toString();
                Toast.makeText(TestActivity.this, "" + data, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create();
        builder.show();

    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
