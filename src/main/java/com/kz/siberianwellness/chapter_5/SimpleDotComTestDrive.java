package com.kz.siberianwellness.chapter_5;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 0, 4};

        dot.setLocationCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

    }
}