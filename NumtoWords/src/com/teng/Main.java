package com.teng;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int newnum = reverse(number);
        int correctcount = getDigitCount(number);
        int originalcount = getDigitCount(newnum);
        int diff = correctcount - originalcount;
        if(newnum == 0){
            System.out.println("Zero");
        }
        while(newnum != 0){
            int printed = newnum % 10;
            newnum /= 10;
            switch (printed){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
        }
        if(diff > 0){
            for(int i = 0; i < diff; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int newnum = 0;
        while(number != 0){
            newnum = newnum*10 + number%10;
            number /= 10;
        }
        return newnum;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
        while (number != 0){
            count++;
            number /= 10;
        }
        return count;
    }
}
