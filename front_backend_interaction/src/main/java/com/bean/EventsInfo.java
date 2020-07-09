package com.bean;

import java.util.Date;

public class EventsInfo {
    private Integer eventId;

    private Integer eventCate;

    private Date eventStartTime;

    private String eventCountry;

    private Date eventUpdateTime;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getEventCate() {
        return eventCate;
    }

    public void setEventCate(Integer eventCate) {
        this.eventCate = eventCate;
    }

    public Date getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventCountry() {
        return eventCountry;
    }

    public void setEventCountry(String eventCountry) {
        this.eventCountry = eventCountry == null ? null : eventCountry.trim();
    }

    public Date getEventUpdateTime() {
        return eventUpdateTime;
    }

    public void setEventUpdateTime(Date eventUpdateTime) {
        this.eventUpdateTime = eventUpdateTime;
    }
}