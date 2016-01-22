package com.candidcold.adapt.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.candidcold.adapt.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView image = (ImageView) findViewById(R.id.detail_image);
        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        TextView textView3 = (TextView) findViewById(R.id.text3);

        Intent intent = getIntent();
        Glide.with(this).load(intent.getIntExtra("IMAGE", 0)).into(image);
        textView1.setText(intent.getStringExtra("TEXT1"));
        textView2.setText(intent.getStringExtra("TEXT2"));
        textView3.setText(intent.getStringExtra("TEXT3"));
    }
}
