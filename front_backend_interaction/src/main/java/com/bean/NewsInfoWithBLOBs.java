package com.bean;

public class NewsInfoWithBLOBs extends NewsInfo {
    private String newsText;

    private String newsUrl;

    private String newsAbstract;

    private String newsOriginal;

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText == null ? null : newsText.trim();
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl == null ? null : newsUrl.trim();
    }

    public String getNewsAbstract() {
        return newsAbstract;
    }

    public void setNewsAbstract(String newsAbstract) {
        this.newsAbstract = newsAbstract == null ? null : newsAbstract.trim();
    }

    public String getNewsOriginal() {
        return newsOriginal;
    }

    public void setNewsOriginal(String newsOriginal) {
        this.newsOriginal = newsOriginal == null ? null : newsOriginal.trim();
    }
}