package com.solution.planet.world.andriod.jawahargurukulenglishschool.adapter.studentAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;

public class BusPickUpAdapter extends RecyclerView.Adapter<BusPickUpAdapter.ViewHolder> {
    public static final String TAG=BusPickUpAdapter.class.getCanonicalName();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_bus_pick_up_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BusPickUpAdapter.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvInTimeData, tvOutTimeData;
        CardView cvBusPickUp;

        public ViewHolder(View itemView) {
            super(itemView);
            tvInTimeData = itemView.findViewById(R.id.tvInTimeData);
            tvOutTimeData = itemView.findViewById(R.id.tvOutTimeData);
            cvBusPickUp = itemView.findViewById(R.id.cvBusPickUp);
        }
    }
}
