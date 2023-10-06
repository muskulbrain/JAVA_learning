package com.kz.siberianwellness.chapter_4.Clock;

public class ClockTestDrive {

    public static void main(String[] args) {

        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.print("Time: " + tod);
    }
}