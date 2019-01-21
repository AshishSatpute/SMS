package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.bus;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;


public class BusHomeFragment extends Fragment {

    public static final String TAG = BusHomeFragment.class.getCanonicalName();
    Context context;
    Button pick, drop;

    public BusHomeFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bus_home, container, false);
        Log.i(TAG, "onCreateView: ");
        pick = view.findViewById(R.id.pick);
        drop = view.findViewById(R.id.drop);

        pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pick_up = "pick";
                data(pick_up);
                pick.setBackgroundColor(getResources().getColor(R.color.divider));
            }
        });

        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pick_up = "drop";
                data(pick_up);
                drop.setBackgroundColor(getResources().getColor(R.color.divider));
            }
        });

        return view;
    }

    private void data(String data) {
        SharedPreferences pref = getContext().getSharedPreferences("pick_up", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("pick_up", data);
        editor.commit();
    }

}
