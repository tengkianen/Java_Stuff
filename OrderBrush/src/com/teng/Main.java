package com.teng;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String csvFile = "/Users/kiane/OneDrive/Desktop/order_brush_order.csv";
        BufferedReader br = null;
        String line = "";
        int iteration = 0;
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                if(iteration == 0){
                    iteration++;
                    continue;
                }

                // use comma as separator
                String[] shopee = line.split(cvsSplitBy);
                long newshopid = Long.parseLong(shopee[1]);
                long newuserid = Long.parseLong(shopee[2]); 


                System.out.println("Shopee [orderid = " + shopee[0] + " , shopid = " + newshopid + " , userid = " + newuserid + " , event_time = " + shopee[3] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
