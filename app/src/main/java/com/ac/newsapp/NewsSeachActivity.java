package com.ac.newsapp;

import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class NewsSeachActivity extends AppCompatActivity implements android.app.LoaderManager.LoaderCallbacks<List<News>> {

    private NewsAdapter adapter;
    private TextView emptyStateTextView;
    private static final int NEWS_LOADER_ID = 1;
    private static final String GUARDIAN_REQUEST_URL = "http://content.guardianapis.com/search?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_seach_activity);
    }

    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> data) {

    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader) {

    }

    //TODO: finish this class inspired by this https://github.com/udacity/ud843-QuakeReport/blob/05190298d7e6a7de21e3beb8f940e133fea67b4c/app/src/main/java/com/example/android/quakereport/EarthquakeActivity.java
    //TODO: JSON like this: http://content.guardianapis.com/search?q=debate&tag=politics/politics&from-date=2014-01-01&api-key=test
}
