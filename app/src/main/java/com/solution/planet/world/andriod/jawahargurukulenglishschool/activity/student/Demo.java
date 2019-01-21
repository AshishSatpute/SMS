package com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class Demo extends AppCompatActivity {

    public static final String TAG = Demo.class.getCanonicalName();
    Context context;
    CardView card;
    Dialog dialog;
    TextView txtComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        context = Demo.this;
        Log.i(TAG, "onCreate: ");
        card = findViewById(R.id.card);

        //SharepPref
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
                msgData(txtComment.getText().toString());
                dialog.dismiss();
            }
        });

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
    }

    private void msgData(String data) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("msgData", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("msgData", data);
        editor.commit();
        Log.i(TAG, "msgData: " + pref.getString("msgData", null));
    }
}
