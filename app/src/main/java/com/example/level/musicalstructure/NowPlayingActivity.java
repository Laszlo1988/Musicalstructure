package com.example.level.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_for_nowplaying);

        // Find the "Songs" Button.
        Button songsButton = (Button) findViewById(R.id.songs_button);

        // Set a click listener on that Button
        songsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "play_button" ImageView is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the sub-activity contains the "Songs" activity.
                Intent songsIntent = new Intent(NowPlayingActivity.this, SongsActivity.class);

                //Start the new activity.
                startActivity(songsIntent);
            }
        });

        // Find the "Home" button.
        Button homeButton = (Button) findViewById(R.id.home_button);

        // Set a click listener on the "Home" button.
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "home_button" is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open MainActivity.
                Intent HomeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                //Start the MainActivity.
                startActivity(HomeIntent);
            }
        });

        // Find the "Artists" button.
        Button artistsButton = (Button) findViewById(R.id.artists_button);

        // Set a click listener on the "Artists" button.
        artistsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "artist_button" is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the ArtistsActivity.
                Intent ArtistsIntent = new Intent(NowPlayingActivity.this, ArtistsActivity.class);

                //Start the ArtistsActivity.
                startActivity(ArtistsIntent);
            }
        });

    }
}
