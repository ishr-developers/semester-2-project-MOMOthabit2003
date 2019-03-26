package com.example.mohammedthabet.realmadrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GamesScheduleActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);


        //TODO: Delete this code. You don't need a listener in this activity. This is the activity that loads and displays the data.
        /* Set the onClick listener for the button.
        Button searchButton = findViewById(R.id.image_Show_GamesSchedule);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This is the code that gets run when the button is clicked.
                startLoader();
            }
        }); */
        

        //These functions will be called whenever the Activity starts.
        startLoader();
        displayResults();
    }

    public void startLoader() {
        //TODO: This is where you want to initiate the loader.
    }


    //TODO: You need a function that will display the results once they've been loaded.
    public void displayResults() {

    }

}