package com.bean;

public class EventsInfoWithBLOBs extends EventsInfo {
    private String eventTitle;

    private String eventDis;

    private String eventVec;

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle == null ? null : eventTitle.trim();
    }

    public String getEventDis() {
        return eventDis;
    }

    public void setEventDis(String eventDis) {
        this.eventDis = eventDis == null ? null : eventDis.trim();
    }

    public String getEventVec() {
        return eventVec;
    }

    public void setEventVec(String eventVec) {
        this.eventVec = eventVec == null ? null : eventVec.trim();
    }
}