package com.vk;

public class Main {
    private static final int AMOUNT_OF_NUMBERS = 10;

    public static void main(String[] args) throws IllegalArgumentException {
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            int randomNumber = (int) (-100 + Math.random() * (100));
            if (randomNumber < 0) throw new IllegalArgumentException();
            double squareRootOfRandomNumber = Math.sqrt(randomNumber);
            int decimalPartOfSquareRoot = (int) squareRootOfRandomNumber;
            if (decimalPartOfSquareRoot * decimalPartOfSquareRoot == randomNumber) System.out.println(randomNumber);
        }
    }
}
