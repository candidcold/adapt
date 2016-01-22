package com.candidcold.adapt.combined.comics;

import android.support.annotation.DrawableRes;

/**
 * Created by davidmorant on 1/18/16.
 */
public class Comic {
    private @DrawableRes int coverImage;
    private String title;
    private String writer;
    private String description;

    public Comic(int coverImage, String title, String writer, String description) {
        this.coverImage = coverImage;
        this.title = title;
        this.writer = writer;
        this.description = description;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getDescription() {
        return description;
    }
}
