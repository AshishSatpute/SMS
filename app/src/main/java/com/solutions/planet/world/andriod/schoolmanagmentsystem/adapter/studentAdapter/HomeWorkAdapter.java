package com.solutions.planet.world.andriod.schoolmanagmentsystem.adapter.studentAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class HomeWorkAdapter extends RecyclerView.Adapter<HomeWorkAdapter.ViewHolder> {
    public static final String TAG=HomeWorkAdapter.class.getCanonicalName();
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_homework_card, parent, false);
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
        TextView tvHW, tvBy, tvDate;
        CardView cvHomeworkStudent;

        public ViewHolder(View itemView) {
            super(itemView);
            tvHW = itemView.findViewById(R.id.tvHW);
            tvBy = itemView.findViewById(R.id.tvBy);
            tvDate = itemView.findViewById(R.id.tvDate);
            cvHomeworkStudent = itemView.findViewById(R.id.cvCommentToStudent);
        }
    }
}
