package com.basic.practice;

import java.util.Scanner;

public class Farenheit2Celcius {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a degree in Far : " );
		
		double farhenheight = input.nextDouble();
		double celcius = ((5*(farhenheight-32.0))/9.0 );
		System.out.println(farhenheight + " Degree farhenheight is : "+ celcius);
	}

}
