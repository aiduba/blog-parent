package com.blog.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期类
 */
public class VeDate {
    /**
     * 将短时间格式时间转换为字符串 yyyy-MM-dd
     *
     * @param dateDate
     * @return
     */
    public static Integer dateToInt(Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(dateDate);
        return Integer.parseInt(dateString);
    }

    public static void main(String[] args) {
        System.out.println(dateToInt(new Date()));
    }
}
