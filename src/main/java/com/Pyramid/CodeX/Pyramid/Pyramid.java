package com.Pyramid.CodeX.Pyramid;

public class Pyramid {
	
	public static void pyramidDesign(int n)
	{
		// number of lines / rows & columns controller
					for (int i=1;i<=n;i++) {
						// number of space controllers
						for (int j=1;j<=n-i;j++) {
							System.out.print(" ");
						}
						// number of symbols controller
						for (int z=1;z<=i;z++) {
							System.out.print("=");
						}
						/* print mirror image of the pattern starting the second line
						 * to do that start from 1 and end at i-1 or the reverse
						*/
						for (int x=i-1;x>=1;x--) {
							System.out.print("=");
						}
						// new line
						System.out.println();
					}
	}
	
	
}
