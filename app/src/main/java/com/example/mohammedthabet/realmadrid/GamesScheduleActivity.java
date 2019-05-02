package com.example.mohammedthabet.realmadrid;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mohammedthabet.realmadrid.MatchesResponse.MatchesItem;
import com.example.mohammedthabet.realmadrid.MatchesResponse.Response;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/* In order to use the DataDownloader class, you have to tell Android that this Activity implements
the loader callbacks. Look to the codelab to see how to do it.
 */



public class GamesScheduleActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    ArrayList<Match> matchList = new ArrayList<Match>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_layout);

        //These functions will be called whenever the Activity starts.

        startLoader();

    }

        public void startLoader() {
        LoaderManager manager = getLoaderManager();
        manager.initLoader(1, null, this);

    }

    @Override
    public Loader<String> onCreateLoader(int id, Bundle args) {
        String url = "https://api.football-data.org/v2/teams/86/matches?status=SCHEDULED";
        return new DataDownloader(this, url);

    }

    public void onLoadFinished(Loader<String> loader, String data) {
        Gson gson = new Gson();
        Response response = gson.fromJson(data, Response.class);

        List<MatchesItem> matchItems = response.getMatches();

        for (int i = 0; i < matchItems.size() ;i++){
            String homeTeamName = matchItems.get(i).getHomeTeam().getName();
            String awayTeamName = matchItems.get(i).getAwayTeam().getName();
            String utcDate = matchItems.get(i).getUtcDate();
            String competitionName = matchItems.get(i).getCompetition().getName();
            String venue = matchItems.get(i).getStage();

            Match match = new Match(competitionName, homeTeamName, awayTeamName, utcDate, venue);
            matchList.add(match);
            
        }

        setupAdapater();

    }

    @Override
    public void onLoaderReset(Loader<String> loader) {

    }

    public void setupAdapater() {
        MatchesRecyclerAdapter adapter = new MatchesRecyclerAdapter(matchList);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        recyclerView.hasFixedSize();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }

}