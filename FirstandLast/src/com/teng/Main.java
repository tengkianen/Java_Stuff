package com.teng;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int first = 0;
        int last = number % 10;
        while(number != 0){
            if(number < 10){
                first = number;
            }
            number /= 10;
        }
        return first + last;
    }
}

