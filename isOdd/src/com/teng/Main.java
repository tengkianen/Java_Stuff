package com.teng;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isOdd(int num){
        if(num <= 0){
            return false;
        }

        if(num % 2 == 1){
            return true;
        } else return false;

    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end < start || start <= 0 || end <= 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
