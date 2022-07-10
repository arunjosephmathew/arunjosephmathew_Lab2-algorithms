package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.services.Transactions;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of transaction Array");
			int size = sc.nextInt();
			int[] array = new int[size];

			System.out.println("Enter the value of Array");
			for (int i = 0; i < array.length; i++)
				array[i] = sc.nextInt();

			System.out.println("Enter the total no of targets that needs to be achieved");
			int target = sc.nextInt();

			for (int i = 0; i < target; i++) {
				System.out.println("Enter the value of target");
				int value = sc.nextInt();

				Transactions transactions = new Transactions();
				transactions.Target(array, value);

			}
			sc.close();	
	}
}
