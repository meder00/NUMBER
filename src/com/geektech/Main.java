package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double[] numbers = {5.6,5.4,-7.7,-8.5,9.0,2,5,6};
        boolean isFirstNegativeNumber = false;
        int count = 0;
        double resultSum = 0;

        for (double number:numbers) {
            if (number < 0){
                isFirstNegativeNumber = true;
            }
            if (isFirstNegativeNumber){
                if (number > 0){
                    resultSum = resultSum + number;
                    count++;
                }
            }
        }
        System.out.println(resultSum/count);
        }
    }