package com.ccc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ning on 2/6/18.
 */
public class Note {
    private String type;

    private Date startDate;
    private Date endDate;
    private String title;
    private List<String> guests;
    private String content;
    private boolean alarm;

    public Note() {

    }

    /**
     * a constructor with a few of params
     *
     * @param type
     * @param startDate
     * @param endDate
     * @param title
     * @param guests
     * @param content
     * @param alarm
     */
    public Note(String type, Date startDate, Date endDate, String title, List<String> guests, String content, boolean alarm) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.guests = guests;
        this.content = content;
        this.alarm = alarm;
    }

    public void print() {
        System.out.println("type : " + getType());
        System.out.println("startDate : " + getStartDate());
        System.out.println("endDate : " + getEndDate());
        System.out.println("title : " + getTitle());
        System.out.println("guests : " + printGuests());
        System.out.println("content : " + getContent());
        System.out.println("alarm : " + getAlarm());
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStartDate(Date start) {
        this.startDate = start;
    }

    public void setEndDate(Date end) {
        this.endDate = end;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGuests(List<String> guests) {
        this.guests = guests;
    }

    public void addGuest(String guest) {
        if (this.guests == null) {
            guests = new ArrayList<String>();
        }
        guests.add(guest);
    }

    public void setContent(String Content) {
        this.content = content;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public String getType() {
        return this.type;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getGuests() {
        return this.guests;
    }

    public String printGuests() {
        StringBuilder sb = new StringBuilder();

        if (guests == null) {
            return "null";
        }
        for (String s : guests) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }

    public String getContent() {
        return this.content;
    }

    public boolean getAlarm() {
        return this.alarm;
    }

}
