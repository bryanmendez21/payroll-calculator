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



        // Optional

        if (hours > 40){
            float regular_pay = pay_rate * 40f;
            float overtime_hours = hours - 40.0f;

            float overtime_pay = overtime_hours *(pay_rate * 1.5f);
            float gross_pay_with_overtime = overtime_pay + regular_pay;
            System.out.printf("%s Gross pay with over time is: %.2f%n", full_name, gross_pay_with_overtime);
        }
        else {
            float regular_pay = hours * pay_rate;
            System.out.printf("%s Gross pay is: %.2f%n", full_name, regular_pay);
        }

    }

}
