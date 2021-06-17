package pageobjects;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="angeline mary";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
		}
		
		//System.out.println(b);
		
		if(b.equalsIgnoreCase("i"))
			
		{
		
		System.out.println(b + ":is a palindrome");
		
		}
		else {
			
			
			System.out.println(b +":is not  palindrome");
		}
	}
	
	

}
