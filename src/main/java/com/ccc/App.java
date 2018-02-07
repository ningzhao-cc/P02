package com.ccc;

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
        // 11
        // Calendar calendar = Calendar.getInstance();

        Calendar calendar = new Calendar();

        Note note1 = calendar.buildBusinessNote();

        Note note2 = calendar.buildPersonalNote();

        System.out.println("note1: ");
        note1.print();

        System.out.println("note2: ");
        note2.print();


    }
}
