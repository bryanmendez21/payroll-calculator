package com.pluralsight;

import java.util.Scanner;

public class payroll_calculator {
    public static void main(String[] args) {
        Scanner payroll = new Scanner(System.in);

        System.out.println("what's your name: ");
        String full_name = payroll.nextLine();

        System.out.println("Hours worked: ");
        float hours = payroll.nextFloat();

        System.out.println("Hourly pay: ");
        float pay_rate = payroll.nextFloat();
    }

}
