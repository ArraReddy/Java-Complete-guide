package com.r177219050.q3;

import java.util.Scanner;

public class NonNumericExepection extends Throwable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int q=9;
		
		try {
			int e=q%w;
			System.out.println(e);
			
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e);
			throw e2;
		}
				
	}

}

