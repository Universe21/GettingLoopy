package com.company;

public class GettingLoopy {

    public static void main(String[] args) {
        for(int i = 0; i <= 30; i++) {

            System.out.println(i);

        }



        for(int i = 30; i >= 0; i--) {

            System.out.println(i);

        }



        for(int i = 0; i <= 18; i += 3){

            System.out.println(i);

        }



        for(int i = 10; i >= 0; i -= 2){

            System.out.println(i);

        }



        for(int i = 0; i < 6; i++) {

            for(int j = 0; j < i; j++) {

                System.out.print("*");

            }

            System.out.println("");

        }



        for(int i = 5; i >= 0; i--) {

            for(int j = 0; j < i; j++) {

                System.out.print("*");

            }

            System.out.println("");

        }



        for(int i = 0; i < 6; i++) {

            for(int j = 0; j < 6; j++) {

                System.out.print("*");

            }

            System.out.println("");

        }
        printCapitalH();
    }

    static void printCapitalH() {
        int height = 5;  // You can change this value as per your requirement

        // Loop for each row
        for (int i = 1; i <= height; i++) {
            // Check if it's the middle row or one of the arms
            if (i == (height / 2) + 1) {
                printHorizontalLine('*');
            } else {
                printVerticalLine('*', 1, 2 * height - 1);
            }
        }
    }

    static void printHorizontalLine(char symbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 * 5 - 1; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    static void printVerticalLine(char symbol, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}







