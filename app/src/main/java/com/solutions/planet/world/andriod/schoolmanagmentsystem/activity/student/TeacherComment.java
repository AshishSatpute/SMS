package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class TeacherComment extends AppCompatActivity {

    public static final String TAG=TeacherComment.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_comment);
        Toolbar toolbar =  findViewById(R.id.toolbar);
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

        // Setting/replace toolbar as the ActionBar

        // send_msg.xml  commne dialogbox ui
    }
}
