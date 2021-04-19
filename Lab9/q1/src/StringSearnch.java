import java.util.Scanner;

public class StringSearnch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String();
		String search=new String();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		str=s.nextLine();
		
		System.out.println("Enter a letter a word or a substring");
		search=s.nextLine();
		
		System.out.println("first index "+str.indexOf(search));
		System.out.println("last index "+str.lastIndexOf(search));
				
	}

}
