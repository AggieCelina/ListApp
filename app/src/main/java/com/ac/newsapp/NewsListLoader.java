package com.ac.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by marka1 on 7/18/17.
 */

public class NewsListLoader extends AsyncTaskLoader<List<News>> {
    private String url;
    private static final String LOG_TAG = NewsListLoader.class.getName();

    public NewsListLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    public List<News> loadInBackground() {

        Log.i(LOG_TAG, "load in backgroung");

        if (url == null) {
            return null;
        }
        List<News> result = QueryUtils.fetchNewsData(url);
        Log.i(LOG_TAG, "fetch data");

        // Return the {@link Event} object as the result fo the {@link TsunamiAsyncTask}
        return result;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.i(LOG_TAG, "force load");
    }
}
