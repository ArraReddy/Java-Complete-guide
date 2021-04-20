public class Ocurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str=new StringBuffer("ARRA SAI NITISH REDDY");
		
		int lent=str.length();
		char srch='a';
		int count=0;
		
		
		for (int i = 0; i < lent; i++) {
			
			if(str.charAt(i)=='A')
			{
				count+=1;
				System.out.println("location:"+i);
			}
			
            
        }
		
		System.out.println("Occurence of A :"+count);
	}

}
