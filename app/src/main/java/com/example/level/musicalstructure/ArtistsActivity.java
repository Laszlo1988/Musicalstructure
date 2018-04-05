package com.example.level.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_for_artists);

        ArrayList<String> artists = new ArrayList<String>();

        artists.add(new String("Amon Amarth"));
        artists.add(new String("Dream Theater"));
        artists.add(new String("Falkenbach"));
        artists.add(new String("Dalriada"));
        artists.add(new String("Alestorm"));

        // Create an {@link ArrayAdapter}, whose data source is a list of {@link String}s. The
        // adapter knows how to create list items for each item in the list.
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link String} in the list.
        listView.setAdapter(adapter);


        // Find the ImageView "play button".
        ImageView playButton = (ImageView) findViewById(R.id.play_button);

        // Set a click listener on that ImageView
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "play_button" ImageView is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the sub-activity contains the "NowPlaying" activity.
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);

                //Start the new activity.
                startActivity(nowPlayingIntent);
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
                Intent HomeIntent = new Intent(ArtistsActivity.this, MainActivity.class);

                //Start the MainActivity.
                startActivity(HomeIntent);
            }
        });

        // Find the "Songs" button.
        Button songsButton = (Button) findViewById(R.id.songs_button);

        // Set a click listener on the "Songs" button.
        songsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "artist_button" is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the SongsActivity.
                Intent SongsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);

                //Start the SongsActivity.
                startActivity(SongsIntent);
            }
        });

    }
}