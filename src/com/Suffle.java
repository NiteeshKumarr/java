package com;

public class Suffle {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		for(int i=0;i<array.length-1;i++) {
		
			array[i]=array[i+1]+array[i];
			array[i+1]=array[i]-array[i+1];
			array[i]=array[i]-array[i+1];
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	
		
	}

}
