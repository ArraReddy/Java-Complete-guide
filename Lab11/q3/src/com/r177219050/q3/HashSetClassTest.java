package com.r177219050.q3;

import java.util.*;

public class HashSetClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arry=new ArrayList<Integer>();
		arry.add(574);
		arry.add(871);
		arry.add(235);
		arry.add(874);
		
		HashSet<Integer> ConHashSet=new HashSet<Integer>(arry);
		System.out.println("HashSet: "+ConHashSet);
		System.out.println("***************************************************");
		
		
		HashSet<Integer> toclear=new HashSet<Integer>(arry);
		System.out.println("Before Clear: "+toclear);
		toclear.clear();
		System.out.println("After clear: "+toclear );
		System.out.println("***************************************************");

		
		HashSet<Employee> emp=new HashSet<Employee>();
		
		Employee e1=new Employee("Rob");
		Employee e2=new Employee("Bob");
		Employee e3=new Employee("Ram");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println("Contain Employee Rob: "+emp.contains(e1));
	}
}
