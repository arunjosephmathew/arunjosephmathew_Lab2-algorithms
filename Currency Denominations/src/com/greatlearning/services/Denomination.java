package com.greatlearning.services;
//For the denomination services

public class Denomination {
	
	public void countNotes(int [] denomination, int payableAmount) {
		
		try {
			if(payableAmount < denomination[denomination.length - 1]) {
				
				System.out.println("Exact amount can't be paid in  available denominations");
				return;
			}
			System.out.println("Your payment approach inorder to give minimum no of notes will be..");
			
			for(int i = 0; i <denomination.length ; i++) {
				
				if(payableAmount >= denomination[i]) {
					
					int countNote = payableAmount / denomination[i];
					
					System.out.println(denomination[i] + ":" + countNote);
					payableAmount -= countNote * denomination[i];
				}
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e + "Notes of 0 denominations is invalid");
		}
	}

}
