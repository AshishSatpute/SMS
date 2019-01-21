package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class EventGallery extends AppCompatActivity {

    public static final String TAG = EventGallery.class.getCanonicalName();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_gallery);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i(TAG, "onCreate: ");
        context=EventGallery.this;

        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(R.string.event_gallery);
        ImageView mImageView = toolbar.findViewById(R.id.tvBack);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
