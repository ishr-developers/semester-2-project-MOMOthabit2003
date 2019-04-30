package com.example.mohammedthabet.realmadrid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesRecyclerAdapter.MatchesViewHolder> {

    ArrayList<Match> list = new ArrayList<Match>();


    @NonNull
    @Override
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_schedule_item_layout, viewGroup, false);
        return new MatchesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolder matchesViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MatchesViewHolder extends RecyclerView.ViewHolder {
        public MatchesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}