package com.example.mohammedthabet.realmadrid;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamesScheduleActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);

        //Set the onClick listener for the button.
        Button searchButton = findViewById(R.id.image_Show_GamesSchedule);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This is the code that gets run when the button is clicked.
                startLoader();
            }
        });

    }

}