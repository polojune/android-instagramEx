package com.cos.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView prView;
    private RecyclerView ctView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prView = findViewById(R.id.pr_view);
        ctView = findViewById(R.id.ct_view);

        ProfileAdapter adapter = new ProfileAdapter();
        adapter.addItem(new Profile("yourStory",R.drawable.propic1));
        adapter.addItem(new Profile("yourStory",R.drawable.propic2));
        adapter.addItem(new Profile("yourStory",R.drawable.propic3));
        adapter.addItem(new Profile("yourStory",R.drawable.propic4));
        adapter.addItem(new Profile("yourStory",R.drawable.propic5));
        adapter.addItem(new Profile("yourStory",R.drawable.propic1));
        adapter.addItem(new Profile("yourStory",R.drawable.propic2));
        adapter.addItem(new Profile("yourStory",R.drawable.propic3));
        adapter.addItem(new Profile("yourStory",R.drawable.propic4));
        adapter.addItem(new Profile("yourStory",R.drawable.propic5));

        prView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        prView.setAdapter(adapter);

        ContentAdapter contentAdapter = new ContentAdapter();
        contentAdapter.addItem(new Content(R.drawable.postpic1));
        contentAdapter.addItem(new Content(R.drawable.postpic2));
        contentAdapter.addItem(new Content(R.drawable.postpic3));
        contentAdapter.addItem(new Content(R.drawable.postpic4));
        contentAdapter.addItem(new Content(R.drawable.postpic5));
        contentAdapter.addItem(new Content(R.drawable.postpic6));
        contentAdapter.addItem(new Content(R.drawable.postpic1));
        contentAdapter.addItem(new Content(R.drawable.postpic2));
        contentAdapter.addItem(new Content(R.drawable.postpic3));
        contentAdapter.addItem(new Content(R.drawable.postpic4));
        contentAdapter.addItem(new Content(R.drawable.postpic5));
        contentAdapter.addItem(new Content(R.drawable.postpic6));

        ctView.setLayoutManager(new LinearLayoutManager(this));
        ctView.setAdapter(contentAdapter);
    }
}