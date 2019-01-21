package com.solution.planet.world.andriod.jawahargurukulenglishschool.adapter.teacherAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AddHomeWorkAdapter extends RecyclerView.Adapter<AddHomeWorkAdapter.ViewHolder> {
    public static final String TAG = AddHomeWorkAdapter.class.getCanonicalName();
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
