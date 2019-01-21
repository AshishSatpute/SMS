package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.admin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdminManagerFragment extends Fragment {


    public AdminManagerFragment() {
        // Required empty public constructor
    }
    public static final String TAG=AdminManagerFragment.class.getCanonicalName();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: AdminManagerFragment");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_manager, container, false);
    }

}
