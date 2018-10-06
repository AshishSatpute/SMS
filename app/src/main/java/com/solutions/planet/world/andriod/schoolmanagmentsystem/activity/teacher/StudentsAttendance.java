package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class StudentsAttendance extends AppCompatActivity {

    public static final String TAG = StudentsAttendance.class.getCanonicalName();
    CardView cardView,cv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_layout);
        Log.i(TAG, "onCreate: ");
        cardView = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: ");
                startActivity(new Intent(StudentsAttendance.this,AttendanceListCollector.class));
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentsAttendance.this,AttendanceListCollector.class));

            }
        });
    }
}
