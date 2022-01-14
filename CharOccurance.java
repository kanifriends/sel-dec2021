package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str="Welcome to chennai";
		int count=0;
		char[] s=str.toCharArray();	
			int length=	s.length;
	for(int i=0;i<length;i++)			
		if(s[i]	=='e')	
			count++;
	System.out.println(count);
		// TODO Auto-generated method stub

	}

}
