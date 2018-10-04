package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class MyClass extends AppCompatActivity {

    private LinearLayout mLayout;
    private EditText mEditText;
    private Button mButton;

    
    public static final String TAG=MyClass.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_demo);
        Log.i(TAG, "onCreate: ");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mLayout = (LinearLayout) findViewById(R.id.linearLayout);
     /*   mEditText = (EditText) findViewById(R.id.editText);*/

       TextView textView = new TextView(this);
        textView.setText("New text");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  //  mLayout.addView(createNewTextView(mEditText.getText().toString()));
                  mLayout.addView(createNewTextView());
            }
        });
    }
                    //createNewTextView(String text)
    private TextView createNewTextView() {
        final LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lparams.gravity = Gravity.CENTER_HORIZONTAL;
        final TextView textView = new TextView(this);
        textView.setLayoutParams(lparams);
        textView.setText("9 std A section: "/* + text*/);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        return textView;
    }



}
