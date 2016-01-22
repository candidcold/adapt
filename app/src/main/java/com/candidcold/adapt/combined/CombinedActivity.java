package com.candidcold.adapt.combined;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.candidcold.adapt.R;
import com.candidcold.adapt.combined.comics.ComicFragment;
import com.candidcold.adapt.combined.shows.ShowFragment;
import com.candidcold.adapt.detail.DetailActivity;

import java.util.ArrayList;

public class CombinedActivity extends AppCompatActivity implements StartDetailCallback {
    private TabLayout tabs;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combined);
        Toolbar toolbar = (Toolbar) findViewById(R.id.combined_toolbar);
        setSupportActionBar(toolbar);

        tabs = (TabLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);

        if (tabs != null && pager != null) {
            initPaging();
        } else {
            initFragments();
        }

    }

    private void initFragments() {
        ComicFragment comicFragment = (ComicFragment) getSupportFragmentManager().findFragmentById(R.id.comic_fragment);
        ShowFragment showFragment = (ShowFragment) getSupportFragmentManager().findFragmentById(R.id.show_fragment);

        // If you need to do something with your fragments, here is where you'd do it.

    }

    private void initPaging() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new ComicFragment());
        fragments.add(new ShowFragment());

        ArrayList<String> tabNames = new ArrayList<>();
        tabNames.add("Comics");
        tabNames.add("Shows");

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), fragments, tabNames);
        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);
        tabs.setTabMode(TabLayout.MODE_FIXED);

    }

    @Override
    public void startDetail(@DrawableRes int image, String text1, String text2, String text3) {

        // Start an activity
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("IMAGE", image);
        intent.putExtra("TEXT1", text1);
        intent.putExtra("TEXT2", text2);
        intent.putExtra("TEXT3", text3);

        startActivity(intent);
    }
}
