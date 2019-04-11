package com.example.mohammedthabet.realmadrid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter {
    ArrayList<Match> list = new ArrayList<Match>();

    public MatchesRecyclerAdapter(ArrayList<Match> listFromActivty) {
        list = listFromActivty;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MatchesViewHolder extends RecyclerView.ViewHolder {

        public MatchesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}