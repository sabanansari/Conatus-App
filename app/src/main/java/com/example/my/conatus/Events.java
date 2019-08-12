package com.example.my.conatus;

public class Events {

    private String EventName;
    private String AboutEvent;
    private int EventThumbnail;


    public Events(String eventName, String aboutEvent, int eventThumbnail) {
        EventName = eventName;
        AboutEvent = aboutEvent;
        EventThumbnail = eventThumbnail;
    }

    public Events() {

    }

    public String getEventName() {
        return EventName;
    }

    public String getAboutEvent() {
        return AboutEvent;
    }

    public int getEventThumbnail() {
        return EventThumbnail;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public void setAboutEvent(String aboutEvent) {
        AboutEvent = aboutEvent;
    }

    public void setEventThumbnail(int eventThumbnail) {
        EventThumbnail = eventThumbnail;
    }
}
