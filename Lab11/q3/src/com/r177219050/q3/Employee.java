package com.r177219050.q3;

public class Employee   {

	
		public String name;
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public Employee(String name)
		{
			this.name=name;
			
			
		}
		
		public Employee(Object obj) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ("name: "+name);
		}
		
//		@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//			Employee temp=new Employee(obj);
//			
//			return (this.getName().equals(temp.getName()));
//		}
//		
	
}
