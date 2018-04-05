package com.example.level.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        //This for loop fill the Song object with the songs of the band Amon Amarth from an Array.
        for (int i = 0; i < AmonAmarth.length; i++) {
            for (int j = 1; j < AmonAmarth[i].length; j++) {
                //At the end of each loop, the song titles, album title and the band's name is added to
                //the ArrayList as a new Song object.
                songs.add(new Song(AmonAmarth[i][j], AmonAmarth[i][0], AmonAmarth[0][0]));
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
    }
}
