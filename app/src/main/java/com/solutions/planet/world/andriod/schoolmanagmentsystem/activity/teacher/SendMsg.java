package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class SendMsg extends AppCompatActivity {

    public static final String TAG=SendMsg.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_msg);
        context = SendMsg.this;
        Log.i(TAG, "onCreate: ");
    }
}
