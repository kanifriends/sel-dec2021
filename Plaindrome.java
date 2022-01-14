package week3.day2;


public class Plaindrome {
	public void main(String[] args) {
	String s="madam";
	String reverse="";
	
	for( int i=s.length()-1; i>=0; i--)
	
	{
	reverse= reverse+s.charAt(i);
	
}
System.out.println(reverse);
{
	if(s.equals(reverse))
	{
		System.out.println("plaindrome");
		
	}
			
	else {
		System.out.println("not plaindrome");
	}
			
}	
			
	}			
}		
			
			
			
			
			
