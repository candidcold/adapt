package com.candidcold.adapt.combined.shows;

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
public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.ShowHolder> {
    private ArrayList<Show> shows;
    private StartDetailCallback callback;

    public ShowAdapter(ArrayList<Show> shows) {
        this.shows = shows;
    }

    @Override
    public ShowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        callback = (StartDetailCallback) parent.getContext();
        View itemView = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ShowHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ShowHolder holder, int position) {
        final Show singleShow = shows.get(position);
        final ImageView transitionImage = holder.showImage;

        holder.setImage(singleShow.getCoverImage());
        holder.setTitle(singleShow.getTitle());
        holder.setNetwork(singleShow.getNetwork());
        holder.setDescription(singleShow.getDescription());

        holder.showLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.startDetail(singleShow.getCoverImage(), singleShow.getTitle(), singleShow.getNetwork(), singleShow.getDescription());
            }
        });

    }

    @Override
    public int getItemCount() {
        return shows.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_show;
    }

    public class ShowHolder extends RecyclerView.ViewHolder {
        private ImageView showImage;
        private TextView showTitle;
        private TextView showNetwork;
        private TextView showDescription;
        private LinearLayout showLayout;

        public ShowHolder(View itemView) {
            super(itemView);

            showImage = (ImageView) itemView.findViewById(R.id.show_image);
            showTitle = (TextView) itemView.findViewById(R.id.show_title);
            showNetwork = (TextView) itemView.findViewById(R.id.show_network);
            showDescription = (TextView) itemView.findViewById(R.id.show_description);
            showLayout = (LinearLayout) itemView.findViewById(R.id.show_layout);

        }

        void setImage(@DrawableRes int image) {
            if (showImage != null) {
                Glide.with(showImage.getContext()).load(image).into(showImage);
            }
        }

        void setTitle(String title) {
            if (showTitle != null) {
                showTitle.setText(title);
            }
        }

        void setNetwork(String writer) {
            if (showNetwork != null) {
                showNetwork.setText(writer);
            }
        }

        void setDescription(String description) {
            if (showDescription != null) {
                showDescription.setText(description);
            }
        }
    }
}
