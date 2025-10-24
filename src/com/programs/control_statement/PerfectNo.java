package com.programs.control_statement;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // find all divisors of num
        for (int i = 1; i <= num / 2; i++) {  // no need to check beyond num/2
            if (num % i == 0) {  // if i divides num
                sum += i;        // add to sum
            }
        }
        //eg:28

        // check if sum of divisors equals number
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
	}

}
