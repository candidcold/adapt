package com.candidcold.adapt.combined.comics;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.candidcold.adapt.R;
import com.candidcold.adapt.combined.StartDetailCallback;

import java.util.ArrayList;

/**
 * Created by davidmorant on 1/18/16.
 */
public class ComicAdapter extends RecyclerView.Adapter<ComicAdapter.ComicHolder> {
    private ArrayList<Comic> comics;
    private StartDetailCallback callback;

    public ComicAdapter(ArrayList<Comic> comics) {
        this.comics = comics;
    }

    @Override
    public ComicHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        callback = (StartDetailCallback) parent.getContext();
        View itemView = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ComicHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ComicHolder holder, int position) {
        final Comic singleComic = comics.get(position);
        final ImageView transitionImage = holder.comicImage;

        holder.setImage(singleComic.getCoverImage());
        holder.setTitle(singleComic.getTitle());
        holder.setWriter(singleComic.getWriter());
        holder.setComicDescription(singleComic.getDescription());

        holder.comicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.startDetail(singleComic.getCoverImage(), singleComic.getTitle(), singleComic.getWriter(), singleComic.getDescription());
            }
        });

    }

    @Override
    public int getItemCount() {
        return comics.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_comic;
    }

    public class ComicHolder extends RecyclerView.ViewHolder {
        private ImageView comicImage;
        private TextView comicTitle;
        private TextView comicWriter;
        private TextView comicDescription;
        private LinearLayout comicLayout;

        public ComicHolder(View itemView) {
            super(itemView);
            comicImage = (ImageView) itemView.findViewById(R.id.comic_image);
            comicTitle = (TextView) itemView.findViewById(R.id.comic_title);
            comicWriter = (TextView) itemView.findViewById(R.id.comic_writer);
            comicDescription = (TextView) itemView.findViewById(R.id.comic_description);
            comicLayout = (LinearLayout) itemView.findViewById(R.id.comic_layout);
        }

        void setImage(@DrawableRes int image) {
            if (comicImage != null) {
                Glide.with(comicImage.getContext()).load(image).into(comicImage);
            }
        }

        void setTitle(String title) {
            if (comicTitle != null) {
                comicTitle.setText(title);
            }
        }

        void setWriter(String writer) {
            if (comicWriter != null) {
                comicWriter.setText(writer);
            }
        }

        void setComicDescription(String description) {
            if (comicDescription != null) {
                comicDescription.setText(description);
            }
        }
    }
}
