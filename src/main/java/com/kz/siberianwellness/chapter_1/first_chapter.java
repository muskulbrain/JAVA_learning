package com.kz.siberianwellness.chapter_1;

import org.junit.jupiter.api.Test;

public class first_chapter {
    @Test
    public void DooBee() {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }

    @Test

    public void shuffield() {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }

    @Test
    public void test() {
        int x = 0;
        int y = 0;
        while (x < 5) {
            x = x +1;
            y=y+x;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }


    @Test
    public void PoolPuzzle() {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
