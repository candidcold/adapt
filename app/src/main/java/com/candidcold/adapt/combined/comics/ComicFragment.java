package com.candidcold.adapt.combined.comics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.candidcold.adapt.ModelManager;
import com.candidcold.adapt.R;

/**
 * Created by davidmorant on 1/19/16.
 */
public class ComicFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_comic, container, false);

        ModelManager manager = new ModelManager();
        RecyclerView comicList = (RecyclerView) rootView.findViewById(R.id.comic_list);
        ComicAdapter adapter = new ComicAdapter(manager.getComicList());
        comicList.setLayoutManager(new GridLayoutManager(getActivity(),
                                                         getResources().getInteger(R.integer.grid_columns),
                                                         GridLayoutManager.VERTICAL,
                                                         false));
        comicList.setAdapter(adapter);

        return rootView;
    }
}
