package com.solutions.planet.world.andriod.schoolmanagmentsystem.adapter.studentAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;
import com.solutions.planet.world.andriod.schoolmanagmentsystem.model.DemoList;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    public static final String TAG=EventAdapter.class.getCanonicalName();
    private Context context;
    private List<DemoList> demoLists;

    public EventAdapter(Context context, List<DemoList> demoLists) {
        this.context = context;
        this.demoLists = demoLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.ViewHolder holder, int position) {
        DemoList demoList = demoLists.get(position);
        holder.name.setText(demoList.getName());
        holder.urlText.setText(demoList.getImageurl());
        holder.card_Event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return demoLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView urlText;
        CardView card_Event;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.date);
            urlText = itemView.findViewById(R.id.tvEventName);
            card_Event = itemView.findViewById(R.id.cvEvent);
        }
    }
}