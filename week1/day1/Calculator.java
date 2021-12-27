package week1.day1;

public class Calculator {
	
	public int sub(int num1, int num2) {
		return num1-num2;}
	
		
	public int mul(int num1,int num2) {
		
		return num1*num2;}
	
	public int div(int num1,int num2) {
		
	return num1/num2;
	}

	public static void main(String[] args) {
		Calculator cal = new  Calculator();
		
		int sub=cal.sub(10,20);
		int mul=cal.mul(10,20);
		int div=cal.div(10,20);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
		
	}
	

		
		
		
		
		// TODO Auto-generated method stub

	}


