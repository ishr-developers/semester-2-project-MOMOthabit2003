package com.example.mohammedthabet.realmadrid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter {
    ArrayList<Match> list = new ArrayList<Match>();

    public MatchesRecyclerAdapter(ArrayList<Match> listFromActivty) {
        list = listFromActivty;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listItemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_schedule_item_layout, viewGroup, false);
        return new MatchesViewHolder(listItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class MatchesViewHolder extends RecyclerView.ViewHolder {

        public TextView homeTeamTextView;
        public TextView awayTeamTextView;

        public MatchesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}