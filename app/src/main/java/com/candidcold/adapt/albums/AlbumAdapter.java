package com.candidcold.adapt.albums;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.candidcold.adapt.R;

import java.util.ArrayList;

/**
 * Created by davidmorant on 1/16/16.
 */
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumHolder> {
    private ArrayList<Album> albums;

    public AlbumAdapter(ArrayList<Album> albums) {
        this.albums = albums;
    }

    @Override
    public AlbumHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new AlbumHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AlbumHolder holder, int position) {
        Album album = albums.get(position);

        holder.setArtist(album.getArtist());
        holder.setAlbumTitle(album.getTitle());
        holder.setAlbumImage(album.getAlbumCover());
        holder.setAlbumDetails(album.getAlbumSummary());
        holder.setAlbumLength(album.getAlbumLength());

    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_album;
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public class AlbumHolder extends RecyclerView.ViewHolder {
        private TextView artistName;
        private TextView albumTitle;
        private ImageView albumImage;

        // Potential fields
        private TextView albumDetails;
        private TextView albumLength;

        public AlbumHolder(View itemView) {
            super(itemView);

            artistName = (TextView) itemView.findViewById(R.id.artist_name);
            albumTitle = (TextView) itemView.findViewById(R.id.album_title);
            albumImage = (ImageView) itemView.findViewById(R.id.album_image);
            albumDetails = (TextView) itemView.findViewById(R.id.album_details);
            albumLength = (TextView) itemView.findViewById(R.id.album_track_count);

        }

        void setArtist(String artist) {
            if (artistName != null) {
                artistName.setText(artist);
            }

        }

        void setAlbumTitle(String album) {
            if (albumTitle != null) {
                albumTitle.setText(album);
            }
        }

        void setAlbumImage(@DrawableRes int image) {
            if (albumImage != null) {
                Glide.with(artistName.getContext()).load(image).into(albumImage);
            }
        }

        void setAlbumDetails(String details) {
            if (albumDetails != null) {
                albumDetails.setText(details);
            }
        }

        void setAlbumLength(int length) {
            if (albumLength != null) {
                String tracks = String.valueOf(length) + " tracks on this album!";
                albumLength.setText(tracks);
            }
        }
    }
}
