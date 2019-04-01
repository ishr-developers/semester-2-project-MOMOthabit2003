package com.example.mohammedthabet.realmadrid;

import android.app.LoaderManager;
import android.os.Bundle;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;


/* In order to use the DataDownloader class, you have to tell Android that this Activity implements
the loader callbacks. Look to the codelab to see how to do it.
 */

public class GamesScheduleActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_layout);

        //These functions will be called whenever the Activity starts.
        startLoader();
        displayResults();
    }

    public void startLoader() {
        LoaderManager manager = getLoaderManager();
        manager.initLoader(1, null, this);

    }

    @Override
    public Loader<String> onCreateLoader(int id, Bundle args) {
        String url = "";
        return new DataDownloader(this, url);

    }

    public void onLoadFinished(Loader<String> loader, String data) {

        //TODO: Implement the loader callback functions.
    }


    //TODO: You need a function that will display the results once they've been loaded.
    public void displayResults() {

    }


    @Override
    public void onLoaderReset(Loader<String> loader) {

    }

}