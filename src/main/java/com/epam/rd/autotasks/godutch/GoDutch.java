package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        if (price<0) {
            System.out.println("Bill total amount cannot be negative");
        }
        else {
            int friends = input.nextInt();
            if (friends<1){
                System.out.println("Number of friends cannot be negative or zero");
            }
            else {
                System.out.println((int)(price * 1.1 / friends));
            }
        }
    }
}
