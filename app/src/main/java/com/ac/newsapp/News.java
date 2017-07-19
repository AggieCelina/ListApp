package com.ac.newsapp;

/**
 * Created by marka1 on 7/18/17.
 */

public class News {

    private String title;
    private String section;
    private String timeOfPublish;
    private String url;

    public News(String title, String section, String timeOfPublish, String url) {
        this.title = title;
        this.section = section;
        this.timeOfPublish = timeOfPublish;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getDateAndTimeOfPublish() {
        return timeOfPublish;
    }

    public String getUrl() {
        return url;
    }
}
