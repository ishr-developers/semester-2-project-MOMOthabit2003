package com.example.mohammedthabet.realmadrid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesRecyclerAdapter.MatchesViewHolder> {


    @NonNull
    @Override
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
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