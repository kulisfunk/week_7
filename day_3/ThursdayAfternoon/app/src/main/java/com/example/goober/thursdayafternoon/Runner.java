package com.example.goober.thursdayafternoon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by goober on 02/11/2017.
 */

public class Runner {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        try {
            Thread.sleep(2000);
            Date newDate = new Date();
            System.out.println(newDate);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);

        try {
            Date halloween = sdf.parse("31/10/2017");
            System.out.println(sdf.format(halloween));
            System.out.println(halloween.before(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
