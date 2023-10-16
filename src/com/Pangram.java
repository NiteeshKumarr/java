package com;

public class Pangram {
	public static void contain(String str) {
		str=str.toLowerCase();
		boolean presentAll=true;
		for(char ch='a';ch<='z';ch++) {
			if(!str.contains(String.valueOf(ch))) {
				
				presentAll=false;
				break;
			}
		}
		if(presentAll) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
	}
	public static void main(String[] args) {
		String str="zabcdefghijklnmopqrstuvwxyz";
		contain(str);
		
	}


}
