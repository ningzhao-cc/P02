package com.ccc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ning on 2/6/18.
 */
public class NoteBuilder implements Builder {
    // 22
    //private Note note;
    //
    //public NoteBuilder() {
    //    this.note = new Note();
    //}

    private Note note = new Note();

    public Note getNote() {
        return note;
    }

    public void setAll(String type, Date start, Date end, String title, List<String> guests, String content, boolean alarm) {
        setType(type);
        setStartDate(start);
        setEndDate(end);
        setTitle(title);
        setGuests(guests);
        setContent(content);
        setAlarm(alarm);
    }

    public void setType(String type) {
        note.setType(type);
    }



    public void setStartDate(Date start) {
        note.setStartDate(start);
    }

    public void setEndDate(Date end) {
        note.setEndDate(end);
    }

    public void setTitle(String title) {
        note.setTitle(title);
    }

    public void setGuests(List<String> guests) {
        note.setGuests(guests);
    }

    public void addGuest(String guest) {
        List<String> guests = note.getGuests();
        if (guests == null) {
            guests = new ArrayList<String>();
        }
        guests.add(guest);
        note.setGuests(new ArrayList<String>(guests));
    }

    public void setContent(String content) {
        note.setContent(content);
    }

    public void setAlarm(boolean alarm) {
        note.setAlarm(alarm);
    }
}
