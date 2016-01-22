package com.candidcold.adapt.combined.shows;

import android.support.annotation.DrawableRes;

/**
 * Created by davidmorant on 1/18/16.
 */
public class Show {
    private @DrawableRes int coverImage;
    private String title;
    private String description;
    private String network;

    public Show(int coverImage, String title, String description, String network) {
        this.coverImage = coverImage;
        this.title = title;
        this.description = description;
        this.network = network;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getNetwork() {
        return network;
    }
}
