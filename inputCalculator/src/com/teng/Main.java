package com.teng;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while(true){
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else{
                break;
            }

            scanner.nextLine();
        }

        avg = Math.round((double)sum/count);

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
