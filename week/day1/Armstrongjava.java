package week.day1;

public class Armstrongjava {

	public static void main(String[] args) {
	 
	
	int sum= 0;
	int input=153;
	int org=input;


	while(input>0){
	
		int rem=input % 10;
        
	input=input/10;
  sum =sum+(rem*rem*rem);
    
	}
	if(sum==org )
	
	

System.out.println("the number is armsstrong");}



}
	
	
		

		// TODO Auto-generated method stub

	


