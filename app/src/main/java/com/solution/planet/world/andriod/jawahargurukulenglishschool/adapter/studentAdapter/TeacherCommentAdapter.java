package com.solution.planet.world.andriod.jawahargurukulenglishschool.adapter.studentAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class TeacherCommentAdapter extends RecyclerView.Adapter<TeacherCommentAdapter.ViewHolder> {
    public static final String TAG= TeacherCommentAdapter.class.getCanonicalName();
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_comment_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMsg, tvdate, tvBy;
        CardView cvCommentToStudent;

        public ViewHolder(View itemView) {
            super(itemView);
            tvMsg = itemView.findViewById(R.id.tvMsg);
            tvdate = itemView.findViewById(R.id.tvdate);
            tvBy = itemView.findViewById(R.id.tvBy);
            cvCommentToStudent = itemView.findViewById(R.id.cvCommentToStudent);
        }
    }
}
