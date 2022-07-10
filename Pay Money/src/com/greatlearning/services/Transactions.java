package com.greatlearning.services;
// For the targets

public class Transactions {
	
	public void Target(int [] array, int value) {
		
		int a = array.length;
		int sum = 0;
		int i = 0;
		
		while(sum <= value && i <a) {
			sum += array[i];
			i++;
		}
		if(sum >= value) {
			System.out.println("Target achieved after " + i + "transcations");
		}
		else {
			System.out.println("Target not achieved");
		}
	}

}
