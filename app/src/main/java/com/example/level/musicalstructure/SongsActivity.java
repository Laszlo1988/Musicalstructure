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

import java.util.ArrayList;


public class SongsActivity extends AppCompatActivity {

    //Full discography of the band Amon Amarth. The [0][0] index of the array contains the bands name.
    // From the line AmonAmarth[1], the lines contains the album names (always index [0] in every line),
    // and the song titles (from index [1] of each line.
    String[][] AmonAmarth = {
            {"Amon Amarth"},
            {"Sorrow Throughout The Nine Worlds (1996)", "Sorrow Throughtout The Nine Worlds", "The Arrival Of The Fimbul Winter", "Burning Creation", "The Mighty Doors Of The Speargod's Hall", "Under The Grayclouded Winter Sky"},
            {"Once Sent From The Golden Hall (1998)", "Ride For Vengeance", "The Dragon's Flight Across The Waves", "Without Fear", "Victorious March", "Friends Of The Suncross", "Abandoned", "Amon Amarth", "Once Sent From The Golden Hall"},
            {"The Avenger (2000)", "Bleed For Ancient Gods", "The Last With Pagan Blood", "North Sea Storm", "Avenger", "God, His Son And Holy Whore", "Metalwrath", "Legend Of A Banished Man", "Thor Arise"},
            {"The Crusher (2001)", "Bastards Of A Lying Breed", "Masters Of War", "The Sound Of Eight Hooves", "Risen From The Sea 2000", "As Long As The Raven Flies", "A Fury Divine", "Annihilation Of Hammerfest", "The Fall Through Ginnungagap", "Releasing Surtur's Fire", "Eyes Of Horror"},
            {"Versus The World (2002)", "Death In Fire", "For The Stabwounds In Our Backs", "Where Silent Gods Stand Guard", "Vs The World", "Across The Rainbow Bridge", "Down The Slopes Of Death", "Thousand Years Of Oppression", "Bloodshed", "...And Soon The World Will Cease To Be", "Siegreicher Marsch (Victorious March)"},
            {"Fate Of Norns (2004)", "An Ancient Sign Of Coming Storm", "Where Death Seems To Dwell", "The Fate Of Norns", "The Pursuit Of Vikings", "Valkyries Ride", "The Beheading Of A King", "Arson", "Once Sealed In Blood"},
            {"With Oden On Our Side (2006)", "Valhall Awaits Me", "Runes To My Memory", "Asator", "Hermod's Ride To Hel - Lokes Treachery Part 1", "Gods Of War Arise", "With Oden On Our Side", "Cry Of The Black Birds", "Under The Northern Star", "Prediction Of Warfare", "Where Silent Gods Stand Guard (Live At Wacken)", "Death In Fire (Live At Wacken)", "With Oden On Our Side (Demo)", "Hermods Ride To Hel - Lokes Treachery Part 1 (Demo)", "Once Sent From The Golden Hall (Sunlight Recording)", "Return Of The Gods (Sunlight Recording)"},
            {"Twilight Of The Thunder God (2008)", "Twilight Of The Thunder God", "Free Will Sacrifice", "Guardians Of Asgaard", "Where Is Your God?", "Varyags Of Miklagaard", "Tattered Banners And Bloody Flags", "No Fear For The Setting Sun", "The Hero", "Live For The Kill", "Embrace Of The Endless Ocean"},
            {"Surtur Rising (2011)", "War Of The Gods", "Töck's Taunt - Loke's Treachery Part II", "Destroyer Of The Universe", "Slaves Of Fear", "Live Without Regrets", "The Last Stand Of Frej", "For Victory Or Death", "Wrath Of The Norsemen", "A Beast Am I", "Doom Over Dead Man", "Aerials"},
            {"Under The Influence (2013)", "Burning Anvil Of Steel", "Satan Rising", "Snake Eyes", "Stand Up To Go Down"},
            {"Deceiver Of The Gods (2013)", "Deceiver Of The Gods", "As Loke Falls", "Father Of The Wolf", "Shape Shifter", "Under Siege", "Blood Eagle", "We Shall Destroy", "Hel", "Coming Of The Tide", "Warriors Of The North"},
            {"Jomsviking (2016)", "First Kill", "Wanderer", "On A Sea Of Blood", "One Against All", "Raise Your Horns", "The Way Of Vikings", "At Dawn's First Light", "One Thousand Burning Arrows", "Vengeance Is My Name", "A Dream That Cannot Be", "Back On Northern Shores"}
    };

    String[][] DreamTheater = {
            {"Dream Theater"},
            {"album: When Dream And Day Unite (1989)", "A Fortune In Lies", "Status Seeker", "The Ytse Jam", "The Killing Hand", "Light Fuse And Get Away", "Afterlife", "The Ones Who Help To Set The Sun", "Only A Matter Of Time"},
            {"album: Images And Words (1992)", "Pull Me Under", "Another Day", "Take The Time", "Surrounded", "Metropolis - Part I - The Miracle And The Sleeper", "Under A Glass Moon", "Wait For Sleep", "Learning To Live"},
            {"album: Awake (1994)", "6:00", "Caught In A Web", "Innocence Faded", "Erotomania", "Voices", "The Silent Man", "The Mirror", "Lie", "Lifting Shadows Off A Dream", "Scarred", "Space-Dye Vest", "EP: A Change Of Seasons (1995)", "A Change Of Seasons", "Funeral For A Friend / Love Lies Bleeding", "Perfect Strangers", "The Rover / Achilles Last Stand / The Song Remains The Same", "The Big Medley"},
            {"album: Falling Into Infinity (1997)", "New Millennium", "You Not Me", "Peruvian Skies", "Hollow Years", "Burning My Soul", "Hell's Kitchen", "Lines In The Sand", "Take Away My Pain", "Just Let Me Breathe", "Anna Lee", "Trial Of Tears"},
            {"album: Scenes From A Memory (1999)", "Scene One: Regression", "Scene Two: I. Overture", "II. Strange Deja Vu", "Scene Three: I. Through My Words", "II. Fatal Tragedy", "Scene Four: Beyond This Life", "Scene Five: Through Her Eyes", "Scene Six: Home", "Scene Seven: I. The Dance Of Eternity", "II. One Last Time", "Scene Eight: The Spirit Carries On", "Scene Nine: Finally Free"},
            {"album: Six Degrees Of Inner Turbulence (2002)", "The Glass Prison", "Blind Faith", "Misunderstood", "The Great Debate", "Disappear", "Six Degrees Of Inner Turbulence"},
            {"album: Train Of Thought (2003)", "As I Am", "This Dying Soul", "Endless Sacrifice", "Honor Thy Father", "Vacant", "Stream Of Consciousness", "In The Name Of God"},
            {"album: Octavarium (2005)", "The Root Of All Evil", "The Answer Lies Within", "These Walls", "I Walk Beside You", "Panic Attack", "Never Enough", "Sacrificed Sons", "Octavarium"},
            {"album: Score (2006)", "The Root Of All Evil", "I Walk Beside You", "Another Won", "Afterlife", "Under A Glass Moon", "Innocence Faded", "Raise The Knife", "The Spirit Carries On", "Six Degrees Of Inner Turbulence", "Vacant", "The Answer Lies Within", "Sacrificed Sons", "Octavarium", "Metropolis"},
            {"album: Systematic Chaos (2007)", "In The Presence Of Enemies, Pt. 1", "Forsaken", "Constant Motion", "The Dark Eternal Night", "Repentance", "Prophets Of War", "The Ministry Of Lost Souls", "In The Presence Of Enemies, Pt. 2"},
            {"album: Black Clouds & Silver Linings (2009)", "A Nightmare To Remember", "A Rite Of Passage", "Wither", "The Shattered Fortress", "The Best Of Times", "The Count Of Tuscany"},
            {"album: A Dramatic Turn Of Events (2011)", "On The Backs Of Angels", "Build Me Up, Break Me Down", "Lost Not Forgotten", "This Is The Life", "Bridges In The Sky", "Outcry", "Far From Heaven", "Breaking All Illusions", "Beneath The Surface"},
            {"album: Dream Theater (2013)", "False Awakening Suite", "The Enemy Inside", "The Looking Glass", "Enigma Machine", "The Bigger Picture", "Behind The Veil", "Surrender To Reason", "Along For The Ride", "Illumination Theory", "EP: Illumination Theory (2014)", "I. Paradoxe De La Lumière Noire", "II. Live, Die, Kill", "III. The Embracing Circle", "IV. The Pursuit Of Truth", "V. Surrender, Trust & Passion"},
            {"album: The Astonishing (2016)", "Descent Of The Nomacs", "Dystopian Overture", "The Gift Of Music", "The Answer", "A Better Life", "Lord Nafaryus", "A Savior In The Square", "When Your Time Has Come", "Act Of Faythe", "Three Days", "The Hovering Sojourn", "Brother, Can You Hear Me?", "A Life Left Behind", "Ravenskill", "Chosen", "A Tempting Offer", "Digital Discord", "The X Aspect", "A New Beginning", "The Road To Revolution", "2285 Entr'acte", "Moment Of Betrayal", "Heaven's Cove", "Begin Again", "The Path That Divides", "Machine Chatter", "The Walking Shadow", "My Last Farewell", "Losing Faythe", "Whispers On The Wind", "Hymn Of A Thousand Voices", "Our New World", "Power Down", "Astonishing"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        //This for loop fill Song objects with the songs of the band "Amon Amarth" from an Array.
        for (int i = 0; i < AmonAmarth.length; i++) {
            for (int j = 1; j < AmonAmarth[i].length; j++) {
                //At the end of each loop, the song titles, album title and the band's name is added to
                //the ArrayList as a new Song object.
                songs.add(new Song(AmonAmarth[i][j], AmonAmarth[i][0], AmonAmarth[0][0]));
            }
        }

        //This for loop fill Song objects with the songs of the band "Dream Theater" from an Array.
        for (int i = 0; i < DreamTheater.length; i++) {
            for (int j = 1; j < DreamTheater[i].length; j++) {
                //At the end of each loop, the song titles, album title and the band's name is added to
                //the ArrayList as a new Song object.
                songs.add(new Song(DreamTheater[i][j], DreamTheater[i][0], DreamTheater[0][0]));
            }
        }

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Find the ImageView "play button".
        ImageView playButton = (ImageView) findViewById(R.id.play_button);

        // Set a click listener on that ImageView
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "play_button" ImageView is clicked on.
            @Override
            public void onClick(View view) {

                //Creating an Intent to open the sub-activity contains the "NowPlaying" activity.
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);

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
                Intent HomeIntent = new Intent(SongsActivity.this, MainActivity.class);

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
                Intent ArtistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);

                //Start the ArtistsActivity.
                startActivity(ArtistsIntent);
            }
        });

    }
}
