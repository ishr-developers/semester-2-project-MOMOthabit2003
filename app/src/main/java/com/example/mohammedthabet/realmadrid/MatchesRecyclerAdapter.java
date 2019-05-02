package com.example.mohammedthabet.realmadrid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesRecyclerAdapter.MatchesViewHolder> {

    ArrayList<Match> list = new ArrayList<Match>();

    public MatchesRecyclerAdapter(ArrayList<Match> listFromActivity) {
        this.list = listFromActivity;
    }


    @NonNull
    @Override
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_schedule_item_layout, viewGroup, false);
        return new MatchesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolder matchesViewHolder, int i) {
        Match currentMatch = list.get(i);


        matchesViewHolder.competitionTextView.setText(currentMatch.competitionName);
        matchesViewHolder.venueTextView.setText(currentMatch.venueName);
        matchesViewHolder.awayTeamTextView.setText(currentMatch.awayTeamName);
        matchesViewHolder.homeTeamTextView.setText(currentMatch.homeTeamName);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MatchesViewHolder extends RecyclerView.ViewHolder {
        TextView homeTeamTextView;
        TextView awayTeamTextView;
        TextView venueTextView;
        TextView competitionTextView;


        public MatchesViewHolder(@NonNull View itemView) {
            super(itemView);
            homeTeamTextView = itemView.findViewById(R.id.tv_home_team_name);
            awayTeamTextView = itemView.findViewById(R.id.tv_away_team_name);
            venueTextView = itemView.findViewById(R.id.tv_match_venue);
            competitionTextView = itemView.findViewById(R.id.tv_competition);
        }

    }

}