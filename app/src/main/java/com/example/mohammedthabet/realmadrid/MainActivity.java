package com.example.mohammedthabet.realmadrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView schedulesImage; //Declare a reference to the ImageView for the schedules.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schedulesImage = findViewById(R.id.image_show_schedule); //Use the genie to connect the reference to the real object.
        schedulesImage.setOnClickListener(new View.OnClickListener() {//Set an onClick listener for the ImageView.
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GamesScheduleActivity.class);
                startActivity(intent);

            }
        });
    }

}
