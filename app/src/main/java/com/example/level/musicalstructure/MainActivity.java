package com.example.level.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the "songs" category
        ImageView songs = (ImageView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "songs" View is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the sub-activity contains the list of songs. Then start this activity.
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                //Start the new activity.
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the family category
        ImageView nowplaying = (ImageView) findViewById(R.id.nowplaying);

        // Set a click listener on that View
        nowplaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the sub-activity contains the list of numbers. Then start this activity.
                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                //Start the new activity.
                startActivity(nowplayingIntent);
            }
        });

        // Find the View that shows the colors category
        ImageView artists = (ImageView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the sub-activity contains the list of numbers. Then start this activity.
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                //Start the new activity.
                startActivity(artistsIntent);
            }
        });

    }
}
