package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.teacher;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;


public class AttendnaceList extends Fragment {

    public static final String TAG = AttendnaceList.class.getCanonicalName();
    Context context;
    View includeView;
    Switch attendSwitch;


    public AttendnaceList() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attendnace_list, container, false);
        Log.i(TAG, "onCreateView: ");


            //sharePref
        includeView = view.findViewById(R.id.student1);
        attendSwitch = includeView.findViewById(R.id.attendSwitch);
        attendSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    attendanceData(b);
                } else {
                    attendanceData(b);
                }

            }
        });


        return view;
    }

    private void attendanceData(boolean b) {
        SharedPreferences pref = getContext().getSharedPreferences("attendance", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("attendance", b);
        editor.commit();
    }
}
