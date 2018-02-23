package com.ccc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 2/6/18.
 */
public class Calendar {
    private List<Note> notes;


    private static Calendar instance;



    // 22

    /**
     *
     * @return
     */
    public static Calendar getInstance() {
        // non thread-safe, Lazy
        if (instance == null) {
            instance = new Calendar();
        }
        return instance;
    }

    //
    //private Calendar() {
    //
    //}
    //
    //private static final Calendar instance = new Calendar();
    //
    ///**
    // *  get Calendar instance, static factory method, Hungry
    // * @return
    // */
    //public static Calendar getInstance() {
    //    return instance;
    //}

    private Builder builder = new NoteBuilder();



    public List<Note> getNote() {
        return notes;
    }

    public void addNote(Note note) {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        notes.add(note);
    }

    public void delteNote(Note note) {
        if (notes == null) {
            return;
        }
        notes.remove(note);
        return;
    }

    public void print() {
        if (notes == null) {
            System.out.println("there is no note in calendar!");
            return;
        }

        for(Note note : notes) {
            note.print();
            System.out.println();
        }
    }

    public Note buildBusinessNote() {
        //builder.buildNote(); // 11
        builder.setType("business");
        addNote(builder.getNote());
        return builder.getNote();
    }

    public Note buildPersonalNote() {
        //builder.buildNote(); // 11
        builder.setType("personal");
        addNote(builder.getNote());
        return builder.getNote();
    }

    public Builder getBuilder() {
        return builder;
    }

}
