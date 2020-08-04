package com.teng;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasSharedDigit(int first, int second){
        if(first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        }

        int lastNumber1 = first % 10;
        int lastNumber2 = second % 10;

        first /= 10;
        second /= 10;

        if(lastNumber1 == lastNumber2 || first == second || lastNumber1 == second || lastNumber2 == first){
            return true;
        }

        return false;
    }
}
