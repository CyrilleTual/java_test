package com.openclassrooms;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

	public static void main(String[] args) {

		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Bienvenue dans Eclipse !");
 
		}
		
		final  int[] myArray = {12,45,36};
		
		String phrase = "C'est la fin ! mon petit lapin " ;

		System.out.println(phrase);
		
		String shortPhrase = StringUtils.abbreviate(phrase, 15);
		
		System.out.println(shortPhrase+"\n");
		
		Cat minou = new Cat("minou");
		
		for (int item : myArray) System.out.print(item+" ");
 
		
		System.out.println(minou.getName());
		
		minou.setName("polo"); 
		
		System.out.println(minou.getName());
		
		
		int result = addNumbers(1,5);
		System.out.println(result);
		
		 
	}

	protected static int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

}
