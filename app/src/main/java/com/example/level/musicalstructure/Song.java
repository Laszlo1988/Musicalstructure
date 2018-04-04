package com.example.level.musicalstructure;

// {@link Song} represents a single song in a music player application.
// It contains three String object: mSongTitle, mAlbum, mArtist

public class Song {

    //Title of a song.
    private String mSongTitle;

    //Album title.
    private String mAlbumTitle;

    //Artist's name.
    private String mArtist;

    /**
     * Create a new Word object.
     *
     * @param songTitle  is the title of an exact song.
     * @param albumTitle is the title of corresponding album title of the exact song.
     * @param artist     is the artist of the song at hand.
     */
    public Song(String songTitle, String albumTitle, String artist) {

        mSongTitle = songTitle;

        mAlbumTitle = albumTitle;

        mArtist = artist;
    }

    //Get the title of the song
    public String getSongTitle() {
        return mSongTitle;
    }

    //Get the album title.
    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    //Get the artist's name.

    public String getArtist() {
        return mArtist;
    }


}

