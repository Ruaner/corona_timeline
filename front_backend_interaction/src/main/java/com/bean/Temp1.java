package com.bean;

public class Temp1 {
    private Integer newsId;

    private String newsTitle;

    private String newsUpTime;

    private String newsMediaName;

    private String newsTopics;

    private Integer newsMediaId;

    private String newsCountry;

    private String newsCate;

    private String eventId;

    private Integer newsAttitude;

    private Float newsAttiScore;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsUpTime() {
        return newsUpTime;
    }

    public void setNewsUpTime(String newsUpTime) {
        this.newsUpTime = newsUpTime == null ? null : newsUpTime.trim();
    }

    public String getNewsMediaName() {
        return newsMediaName;
    }

    public void setNewsMediaName(String newsMediaName) {
        this.newsMediaName = newsMediaName == null ? null : newsMediaName.trim();
    }

    public String getNewsTopics() {
        return newsTopics;
    }

    public void setNewsTopics(String newsTopics) {
        this.newsTopics = newsTopics == null ? null : newsTopics.trim();
    }

    public Integer getNewsMediaId() {
        return newsMediaId;
    }

    public void setNewsMediaId(Integer newsMediaId) {
        this.newsMediaId = newsMediaId;
    }

    public String getNewsCountry() {
        return newsCountry;
    }

    public void setNewsCountry(String newsCountry) {
        this.newsCountry = newsCountry == null ? null : newsCountry.trim();
    }

    public String getNewsCate() {
        return newsCate;
    }

    public void setNewsCate(String newsCate) {
        this.newsCate = newsCate == null ? null : newsCate.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public Integer getNewsAttitude() {
        return newsAttitude;
    }

    public void setNewsAttitude(Integer newsAttitude) {
        this.newsAttitude = newsAttitude;
    }

    public Float getNewsAttiScore() {
        return newsAttiScore;
    }

    public void setNewsAttiScore(Float newsAttiScore) {
        this.newsAttiScore = newsAttiScore;
    }
}