package com.Pyramid.CodeX.Pyramid;

import java.util.Scanner;

/**
 * Create pyramid design
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Scanner object
		Scanner myObj = new Scanner(System.in);
		// User has to decide how many number of lines 
		System.out.println("Please enter the number of lines or pyramid level");
		int n = myObj.nextInt();
		Pyramid.pyramidDesign(n);
		myObj.close();
    }
}
