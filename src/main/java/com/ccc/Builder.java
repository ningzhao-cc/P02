package com.ccc;

import java.util.Date;
import java.util.List;

/**
 * Created by Ning on 2/6/18.
 */
public interface Builder {
    public Builder buildNote(); // 11

    public Note getNote();

    public Builder setType(String type);

    public void setTitle(String title);

    public void setStartDate(Date start);

    public void setEndDate(Date end);

    public Builder setGuests(List<String> guests);

    public void addGuest(String guest);

    public void setContent(String content);

    public void setAlarm(boolean alarm);

    public void setAll(String type, Date start, Date end, String title, List<String> guests, String content, boolean alarm);

}
