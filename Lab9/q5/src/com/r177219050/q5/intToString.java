package com.r177219050.q5;

public class intToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int a=585;
		Integer Int=new Integer(a);
		System.out.println(Int);
		
		String IntToStr=String.valueOf(Int);
		System.out.println(IntToStr);
			
		int strToInt=Integer.parseInt(IntToStr);
		System.out.println(strToInt);
				
		String intToStr=String.valueOf(strToInt);
		System.out.println(intToStr);
		
		Integer Int2=new Integer(intToStr);
		System.out.println(Int2);
		
		int a2=Int2.intValue();
		System.out.println(a2);		
	}		
}
