package com.example.level.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_for_nowplaying);

        ArrayList<Song> nowPlayingExample = new ArrayList<Song>();

        nowPlayingExample.add(new Song("The Enemy Inside", "Dream Theater (2013)", "Dream Theater"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, nowPlayingExample);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

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
