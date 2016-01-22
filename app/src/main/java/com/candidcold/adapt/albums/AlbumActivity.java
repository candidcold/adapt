package com.candidcold.adapt.albums;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.candidcold.adapt.ModelManager;
import com.candidcold.adapt.R;
import com.candidcold.adapt.combined.CombinedActivity;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ModelManager manager = new ModelManager();
        ArrayList<Album> albums = manager.getAlbumList();

        RecyclerView albumRecyclerView = (RecyclerView) findViewById(R.id.album_list);
        AlbumAdapter adapter = new AlbumAdapter(albums);
        albumRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        albumRecyclerView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlbumActivity.this, CombinedActivity.class);
                startActivity(intent);
            }
        });


    }
}
