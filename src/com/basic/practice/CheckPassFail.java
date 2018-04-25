package com.basic.practice;

import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number : ");

		int inputParam = input.nextInt();
		boolean result = checkResult(inputParam);
		System.out.println("you entered : "+inputParam+" Pass ? : "+result);
		
	}

	private static boolean checkResult(int inputParam) {
		
		int mark = inputParam;
		if(mark<40){
			return false;
		} else{
			return true;
		}
	}

}
