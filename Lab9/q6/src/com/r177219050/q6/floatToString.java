package com.r177219050.q6;
public class floatToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f=154;
		Float F=new Float(f);
		System.out.println(F);
		
		String S=String.valueOf(f);
		System.out.println(S);
		
		float f2=Float.parseFloat(S);
		System.out.println(f2);
		
		String S2=String.valueOf(f2);
		System.out.println(f2);
		
		Float F2=new Float(f2);
		System.out.println(F2);
		
		float f3=F2.intValue();
		System.out.println(f3);	
	}
}
