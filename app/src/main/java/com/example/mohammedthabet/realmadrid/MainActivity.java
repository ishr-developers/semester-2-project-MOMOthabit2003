package com.example.mohammedthabet.realmadrid;

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
                //TODO: Launch the GamesScheduleActivity! You know how to do this.
            }
        });
    }


    //TODO: Delete this source code. You don't need it.
    /*
    public void launchWebActivity(View view) {

        String url;
        //Send url to WebActivity
        Intent intent = new Intent(this, WebActivity.class);
        //Put the url in the intent
        int viewId = view.getId();
        switch(viewId){
            case R.id.image_Show_History: url = "https://www.realmadrid.com/en/about-real-madrid/history/football";
                break;

            case R.id.image_Show_News: url="https://www.newsnow.co.uk/h/Sport/Football/La+Liga/Real+Madrid/Transfer+news";
                break;

            case R.id.image_Show_GamesSchedule: url="https://www.google.de/search?q=real+madrid+games+schedule&oq=real+madrid+games+schedule&aqs=chrome..69i57j0l2.9638j1j4&sourceid=chrome&ie=UTF-8#sie=t;/m/06l22;2;/m/09gqx;mt;fp;1;;";
                break;

            case R.id.image_Show_Website: url="https://www.realmadrid.com/en";
                break;

            default: url="https://www.google.com/";
        }
        //Bundle the urk in an intent extra
        intent.putExtra("url", url);
        startActivity(intent);  */





}
