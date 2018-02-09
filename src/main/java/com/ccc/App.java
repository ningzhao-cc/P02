package com.ccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Design pattern -- Builder
 *
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 22
        // Calendar calendar = Calendar.getInstance();

        Calendar calendar = new Calendar();

        Note note1 = calendar.buildBusinessNote();

        note1.addGuest("Nathan");
        note1.setTitle("builder");
        note1.setContent("something very important");
        note1.setStartDate(new Date());

        //Note note1 = calendar.getBuilder().buildNote();
        //calendar.getBuilder().setAll("business", new Date(), new Date(),
        //                           "builder", Arrays.asList("Nathon"), "something very important", true);

        //
        //Builder builder = calendar.getBuilder();
        //Note note1 = builder.buildNote();
        //builder.setType("business");
        //builder.setGuests(Arrays.asList("Nathan"));

        System.out.println("note1: ");
        note1.print();

        System.out.println();

        Note note2 = calendar.buildPersonalNote();

        // 11
        //System.out.println("note1: ");
        //note1.print();

        System.out.println("note2: ");
        note2.print();

        System.out.println();

        //System.out.println("Calendar: ");
        //calendar.print();

    }
}
