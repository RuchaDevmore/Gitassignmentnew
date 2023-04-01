package com.velocity;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int a[]=new int[5]; //declaration and instantiation
		//how to add the elements into array
		a[0]=10; //initalization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		//how to iterate or traverse array
	//	System.out.println("Length of array is>>"+a.length);
		for(int i=0;i<a.length;i++) {  //i<5 - 5<5
			System.out.println(a[i]); //a[3]- 10 20 30 40 50
		}
		//jvm control
	}
}
