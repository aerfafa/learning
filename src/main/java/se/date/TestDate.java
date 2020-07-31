package se.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-28  16:12
 */
public class TestDate {

    public static  void main(String args[]){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        // 往后是负数eg:-10，往前是正数:10
        //往后10天
        calendar.add(Calendar.DATE,10);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        //往后两周
        calendar.add(Calendar.WEEK_OF_MONTH,2);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        //往后10月
        calendar.add(Calendar.MONTH,10);
        System.out.println(simpleDateFormat.format(calendar.getTime()));


    }



}
