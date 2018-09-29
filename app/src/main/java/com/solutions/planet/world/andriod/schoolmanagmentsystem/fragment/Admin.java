package com.solutions.planet.world.andriod.schoolmanagmentsystem.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Admin extends Fragment{

    private DrawerLayout drawer;
    public static Fragment getInstance() {
        return new Admin();
    }


    public Admin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_admin, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        drawer = view.findViewById(R.id.adminDrawerlayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(getActivity(),drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        return view;
    }

}
