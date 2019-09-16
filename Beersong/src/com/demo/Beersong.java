package com.demo;

public class Beersong {
	public static void main(String[] args) {
		int n=99;
		for(n=99;n>=0;n--) {
			if(n>1)
				System.out.printf("%d bottles of beer on the wall.%d bottles of beer.\n"
						+ "Take one down.\nPass it around\n%d bottles of beer on the wall.\n",n,n,n-1);
			else if(n==1)
				System.out.printf("%d bottle of beer on the wall.%d bottle of beer.\n"
						+ "Take one down.\nPass it around.\n%d bottle of beer on the wall.\n",n,n,n-1);
			else
				System.out.printf("No more bottles of beer on the wall.");
		}
	}

}
