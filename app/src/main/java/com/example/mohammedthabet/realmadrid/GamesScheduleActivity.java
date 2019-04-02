package com.example.mohammedthabet.realmadrid;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;


/* In order to use the DataDownloader class, you have to tell Android that this Activity implements
the loader callbacks. Look to the codelab to see how to do it.
 */

public class GamesScheduleActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    //Need an ArrayList to hold the earthquake items. This data will get passed to the adapter.
    public ArrayList<GamesquakeItem> list = new ArrayList<GamesquakeItem>();
    //Sample JSON Response
    String gameJson = null;

    RecyclerView recyclerView = null;
    QuakeRecyclerAdapter adapter = null;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_layout);

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
        //TODO: You need to map all of the data to a Java Object using Gson().
        //Look at the quake example on how the results were processed to do this.


        //TODO: Now you need to set up an adapter and populate it with the data.
    }




    @Override
    public void onLoaderReset(Loader<String> loader) {

    }

}