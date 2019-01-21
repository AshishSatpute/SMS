package com.solution.planet.world.andriod.jawahargurukulenglishschool.adapter.teacherAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class TeacherCommentAdapter extends RecyclerView.Adapter<TeacherCommentAdapter.ViewHOlder> {
    public static final String TAG = TeacherCommentAdapter.class.getCanonicalName();
    private Context context;
    @NonNull
    @Override
    public ViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHOlder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHOlder extends RecyclerView.ViewHolder {
        public ViewHOlder(View itemView) {
            super(itemView);
        }
    }
}
