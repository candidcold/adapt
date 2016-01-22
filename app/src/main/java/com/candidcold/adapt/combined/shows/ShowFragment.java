package com.candidcold.adapt.combined.shows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.candidcold.adapt.ModelManager;
import com.candidcold.adapt.R;

/**
 * Created by davidmorant on 1/19/16.
 */
public class ShowFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_show, container, false);

        ModelManager manager = new ModelManager();
        RecyclerView showList = (RecyclerView) rootView.findViewById(R.id.show_list);
        ShowAdapter adapter = new ShowAdapter(manager.getShowList());
        showList.setLayoutManager(new LinearLayoutManager(getActivity(),
                                                          LinearLayout.VERTICAL,
                                                          false));
        showList.setAdapter(adapter);

        return rootView;
    }
}
