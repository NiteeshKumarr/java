package com;

import java.util.Scanner;

public class RomanNumber {
	 public static int romanNumber(String input) {
	    	String[] roman = {"0","i","ii","iii","iv","v","vi","vii","viii","ix","x"};
	    	int res=0;
	    	for(int i=0;i<roman.length;i++) {
	    		if(input.equals(roman[i])) {
	    		res=i;
	    		}
	    		else {
	    			return 0;
	    		}
	    	}
	    	return res; 
	    			
	    }
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roman Number: ");
			String input = sc.next();
			System.out.println("Roman Number for "+input+" is "+ romanNumber(input));
			sc.close();
		}


}
