package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.teacher;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
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


    CardView cardView;
    public static final String TAG = MyClass.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_demo);
        Log.i(TAG, "onCreate: ");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mLayout = (LinearLayout) findViewById(R.id.linearLayout);
        /*   mEditText = (EditText) findViewById(R.id.editText);*/
        //  cardView = findViewById(R.id.cvcv);
        TextView textView = new TextView(this);
        textView.setText("New text");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  mLayout.addView(createNewTextView(mEditText.getText().toString()));
          //      mLayout.addView(createNewTextView());


                CardView card = new CardView(MyClass.this);

                // Set the CardView layoutParams
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT

                );
                card.setLayoutParams(params);

                // Set CardView corner radius
                card.setRadius(9);

                params.setMargins(32,32,32,32);
                params.gravity = 1;
                // Set cardView content padding
                card.setContentPadding(15, 15, 15, 15);

                // Set a background color for CardView
                card.setCardBackgroundColor(Color.parseColor("#FFFFFF"));

                // Set the CardView maximum elevation
                card.setMaxCardElevation(15);

                // Set CardView elevation
                card.setCardElevation(8);


                // Initialize a new TextView to put in CardView
                TextView tv = new TextView(MyClass.this);
                tv.setLayoutParams(params);
                tv.setText("2 std section A");
               tv.setGravity(Gravity.CENTER_HORIZONTAL);
                //tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                //tv.setTextColor(Color.RED);

                // Put the TextView in CardView
                card.addView(tv);
                card.getCardElevation();
                // Finally, add the CardView in root layout
                mLayout.addView(card);

            }
        });
    }

    //createNewTextView(String text)
   /* private  createNewTextView() {
        *//*final LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lparams.gravity = Gravity.CENTER_HORIZONTAL;
         CardView cardView = new CardView(this);
        cardView = findViewById(R.id.cvcv);
        final TextView textView = new TextView(this);
        textView.setLayoutParams(lparams);
        textView.setText("9 std A section: "*//**//* + text*//**//*);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        return textView;*//*


    }*/




}
