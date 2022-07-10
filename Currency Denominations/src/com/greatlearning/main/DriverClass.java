package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.MergeSort;
import com.greatlearning.services.Denomination;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denomination = new int [size];
		
		System.out.println("Enter the currency denomination value");
		for(int i =0; i < size ;i++) {
			denomination[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int payableAmount = sc.nextInt();
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(denomination, 0, denomination.length -1);
		
		Denomination deno = new Denomination();
		deno.countNotes(denomination, payableAmount);
		
		sc.close();

	}
	

}
