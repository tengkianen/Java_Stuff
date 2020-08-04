package com.teng;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }
        int count = 0;
        for(int i = 1; i <= number; i++){
            for (int k = 1; k <= number; k++){
                count++;
                if (i == 1 || i == number || k == 1 || k == number || i == k || k == number - i + 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                if (count == number){
                    System.out.print("\n");
                    count = 0;
                }
            }
        }
    }
}
