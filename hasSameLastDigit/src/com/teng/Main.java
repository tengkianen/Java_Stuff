package com.teng;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }

        return true;
    }

    public static boolean hasSameLastDigit(int first, int second, int third){
        if (!isValid(first)||!isValid(second)||!isValid(third)){
            return false;
        }
        int firstLast = first % 10;
        int secondLast = second % 10;
        int thirdLast = third % 10;

        if(firstLast == secondLast || firstLast == thirdLast || secondLast == thirdLast){
            return true;
        }

        return false;
    }
}
