package com.ccc;

import java.util.Date;
import java.util.List;

/**
 * Created by Ning on 2/6/18.
 */
public interface Builder {
    public Note getNote();

    public void setType(String type);

    public void setAll(String type, Date start, Date end, String title, List<String> guests, String content, boolean alarm);

}
