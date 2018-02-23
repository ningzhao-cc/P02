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

    private Note note;

    public Builder buildNote() {
        note = new Note();
        return this;
    }

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

    public Builder setType(String type) {
        if (note == null) {
            buildNote();
        }
        note.setType(type);

        return this;

    }



    public void setStartDate(Date start) {
        if (note == null) {
            buildNote();
        }note.setStartDate(start);
    }

    public void setEndDate(Date end) {
        if (note == null) {
            buildNote();
        }
        note.setEndDate(end);
    }

    public void setTitle(String title) {
        if (note == null) {
            buildNote();
        }
        note.setTitle(title);
    }

    public Builder setGuests(List<String> guests) {
        if (note == null) {
            buildNote();
        }
        note.setGuests(guests);
        return this;
    }

    public void addGuest(String guest) {
        if (note == null) {
            buildNote();
        }
        List<String> guests = note.getGuests();
        if (guests == null) {
            guests = new ArrayList<String>();
        }
        guests.add(guest);
        note.setGuests(new ArrayList<String>(guests));
    }

    public void setContent(String content) {
        if (note == null) {
            buildNote();
        }
        note.setContent(content);
    }

    public void setAlarm(boolean alarm) {
        if (note == null) {
            buildNote();
        }note.setAlarm(alarm);
    }

}
