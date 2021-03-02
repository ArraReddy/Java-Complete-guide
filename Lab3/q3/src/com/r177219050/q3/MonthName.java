package com.r177219050.q3;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] monthName=new String[13];
		monthName[1]="Jan";
		monthName[2]="Feb";
		monthName[3]="Mar";
		monthName[4]="Apr";
		monthName[5]="May";
		monthName[6]="June";
		monthName[7]="July";
		monthName[8]="Aug";
		monthName[9]="Sep";
		monthName[10]="Oct";
		monthName[11]="Nov";
		monthName[12]="Dec";
		
		Scanner s=new Scanner(System.in);
		int num;
		System.out.printf("Enter the month number:");
		num=s.nextInt();
		
		System.out.println("The "+num+" month is "+monthName[num]);
		
	
		
		

	}

}

