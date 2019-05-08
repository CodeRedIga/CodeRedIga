package com.company;

import java.util.Scanner;

public class Homework3 {

    private static  Scanner input;

    public static void main(String[]args) {

        String item_1_name = "Tea";
        System.out.println("Enter name of item1 : ");
        input = new Scanner(System.in);
        item_1_name = input.next();
        String item_2_name = "Coffee";

        int item_1_price = 10;
        System.out.println("Enter price of item1 : ");
        input = new Scanner(System.in);
        item_1_price = input.nextInt();

        int item_2_price = 10;
        //TODO: Take input from user for item_2_price
        System.out.println("Enter price of item2 : ");
        input = new Scanner(System.in);
        item_2_price = input.nextInt();


        int item_1_quantity = 2;
        // TODO: Take input from user for item_1_quantity
        System.out.println("Enter quantity of item1 : ");
        input = new Scanner(System.in);
        item_1_quantity = input.nextInt();

        int item_2_quantity = 2;
        // TODO: Take input from user for item_2_quantity
        System.out.println("Enter quantity of item2 : ");
        input = new Scanner(System.in);
        item_2_quantity = input.nextInt();



        // "To calculate the totalcost, multiply the price of the item by quantity of the item"

        double item_1_totalcost = item_1_price * item_1_quantity;
        double item_2_totalcost = item_2_price * item_2_quantity;

        System.out.println("Total cost of " + item_1_name + " is " + item_1_totalcost);
        System.out.println("Total cost of " + item_2_name + " is " + item_2_totalcost);

        int item_1_coupon = 10;
        // TODO: Take input from user for item_1_coupon
        System.out.println("Enter value of the coupon1 : ");
        input = new Scanner(System.in);
        item_1_coupon = input.nextInt();


        int item_2_coupon = 10;
        // TODO: Take input from user for item_2_coupon
        System.out.println("Enter value of the coupon2 : ");
        input = new Scanner(System.in);
        item_2_coupon = input.nextInt();

        //"To calculate the discount, multiply the price of the item by the discount percentage in the coupon"

        double item_1_finalcost = item_1_totalcost - (item_1_totalcost * item_1_coupon / 100);
        double item_2_finalcost = item_2_totalcost - (item_2_totalcost * item_2_coupon / 100);


        System.out.println("Final cost after discount for " +item_1_name + " is " + item_1_finalcost);
        System.out.println("Final cost after discount for " +item_2_name + " is " + item_2_finalcost);

    }
}
