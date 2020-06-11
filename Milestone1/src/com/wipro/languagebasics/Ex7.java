package com.wipro.languagebasics;

import java.util.Arrays;

public class Ex7 {
	public static void main(String[] args) {
		Arrays.sort(args);
		System.out.print(args[0]);
		for(int i=1;i<args.length;i++) {
			System.out.print(","+args[i]);
		}
	}
	
}
