
public class ToCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strb=new StringBuffer("this a sample of the string buffer");
		for (int i = 0; i < strb.length(); i++) {
            char temp = strb.charAt(i);
            strb.setCharAt(i, Character.toUpperCase(temp));
        }
		
		System.out.println("String in captlel letters: "+ strb);
	
	}

}
