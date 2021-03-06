package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class AddHomework extends AppCompatActivity {

    public static final String TAG = AddHomework.class.getCanonicalName();
    Context context;
    Dialog dialog;
    CardView cardView;
    TextView txtComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_homework);
        Toolbar toolbar = findViewById(R.id.toolbar);
        context = AddHomework.this;
        setSupportActionBar(toolbar);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText("AddHomework");
        Log.i(TAG, "onCreate: ");
        ImageView mImageView = toolbar.findViewById(R.id.tvBack);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.send_msg);
        Button send = dialog.findViewById(R.id.send);
        ImageView imageView = dialog.findViewById(R.id.cross);
        txtComment = dialog.findViewById(R.id.txtComment);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sharePref
                homeworkData(txtComment.getText().toString());
                Toast.makeText(context, "homework send", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "cancel", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


        cardView = findViewById(R.id.cccc);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

    }

    private void homeworkData(String data) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("homework", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("homework", data);
        editor.commit();
    }


}
