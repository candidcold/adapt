package com.candidcold.adapt.albums;

import android.support.annotation.DrawableRes;

/**
 * Created by davidmorant on 1/16/16.
 */
public class Album {
    private String title;
    private String albumSummary;
    private String artist;
    private @DrawableRes int albumCover;
    private int albumLength;

    public Album(String title, String artist, String albumSummary, int albumCover, int albumLength) {
        this.title = title;
        this.albumSummary = albumSummary;
        this.artist = artist;
        this.albumCover = albumCover;
        this.albumLength = albumLength;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbumSummary() {
        return albumSummary;
    }

    public int getAlbumCover() {
        return albumCover;
    }

    public int getAlbumLength() {
        return albumLength;
    }

    public String getArtist() {
        return artist;
    }
}
