package com.r177219050.q3;

import java.util.Scanner;
public class StringToCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		String str=new String();
		System.out.println("Enter the string ");
		str=s.nextLine();
		StringBuffer strb=new StringBuffer(str);
		
		for (int i = 0; i < strb.length(); i++) {
            char temp = strb.charAt(i);
            strb.setCharAt(i, Character.toUpperCase(temp));
        }
		
		System.out.println("String in captlel letters "+ strb);
	}

}
