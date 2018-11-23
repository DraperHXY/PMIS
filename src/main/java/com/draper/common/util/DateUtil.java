package com.draper.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class DateUtil {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public static long convertToLong(int year, int month, int date){
        Calendar.Builder builder = new Calendar.Builder();
        Calendar calendar = builder.build();
        calendar.set(year, month, date);

        new DateUtil().LOGGER.warn("year = {}, month = {}, date = {}", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

        return calendar.getTimeInMillis();
    }

}
