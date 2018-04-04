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

        Log.i("MainActivity", "SongsActivity started.");
//
//        // Find the View that shows the family category
//        TextView family = (TextView) findViewById(R.id.family);
//
//        // Set a click listener on that View
//        family.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view) {
//
//                //Creating an Intent to open the sub-activity contains the list of numbers. Then start this activity.
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//
//                //Start the new activity.
//                startActivity(familyIntent);
//            }
//        });
//
//        // Find the View that shows the colors category
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        // Set a click listener on that View
//        colors.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view) {
//
//                //Creating an Intent to open the sub-activity contains the list of numbers. Then start this activity.
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//
//                //Start the new activity.
//                startActivity(colorsIntent);
//            }
//        });
//
//        // Find the View that shows the phrases category
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//        // Set a click listener on that View
//        phrases.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view) {
//
//                //Creating an Intent to open the sub-activity contains the list of numbers. Then start this activity.
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//
//                //Start the new activity.
//                startActivity(phrasesIntent);
//            }
//        });
    }
}
