package com.kz.siberianwellness.chapter_5;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numberOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        boolean[] alreadyGuessed = new boolean[10];

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число: ");
            int guessInt = Integer.parseInt(guess);

            if (alreadyGuessed[guessInt]) {
                System.out.println("Вы уже вводили это число. Введите другое.");
                continue; // Пропустить текущую итерацию цикла и запросить новый ввод
            }

            alreadyGuessed[guessInt] = true; // Пометить введенную координату как использованную

            String result = theDotCom.checkYourself(guess);
            numberOfGuesses++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numberOfGuesses + " попыток");
            }

        }
    }
}