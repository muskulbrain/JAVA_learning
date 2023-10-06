package com.kz.siberianwellness.chapter_3.TestArray;

public class Array {

    public static void main(String[] args) {

        int[] index = new int[4];

        String[] islands = new String[4];

        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские";
        islands[3] = "Косумель";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;

        int ref;
        while (y < 4) {

            ref = index[y];

            System.out.print("Острова = ");

            System.out.println(islands[ref]);

            y = y + 1;
        }










    }
}
