package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class TeacherComment extends AppCompatActivity {

    public static final String TAG = TeacherComment.class.getCanonicalName();
    Context context;
    View includeMsg;
    TextView tvMsg;
    TextView tvdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_comment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(R.string.teacher_comment);
        ImageView mImageView = toolbar.findViewById(R.id.tvBack);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        context = TeacherComment.this;
        Log.i(TAG, "onCreate: ");


        //SharePref
        includeMsg = findViewById(R.id.includeMsg);
        tvMsg = includeMsg.findViewById(R.id.tvMsg);
        tvdate = includeMsg.findViewById(R.id.tvdate);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("msgData", 0);
        if (TextUtils.isEmpty(pref.getString("msgData", null))) {
            includeMsg.setVisibility(View.GONE);
        } else {
            includeMsg.setVisibility(View.VISIBLE);
                tvMsg.setText(pref.getString("msgData", null));
               tvdate.setText("19/01/2018");
        }


        // Setting/replace toolbar as the ActionBar

        // send_msg.xml  commne dialogbox ui
    }
}
