package com.bean;

public class NewsWebsite {
    private Integer id;

    private String websiteName;

    private String url;

    private String country;

    private Integer newWebsiteId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName == null ? null : websiteName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getNewWebsiteId() {
        return newWebsiteId;
    }

    public void setNewWebsiteId(Integer newWebsiteId) {
        this.newWebsiteId = newWebsiteId;
    }
}