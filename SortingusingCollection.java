package week3.day2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;




public class SortingusingCollection{

	public static void main (String[] args) {
		String[] input= {"HCL","Wipro","Aspire System","Cts"};
		int length=input.length;
		System.out.println(length);
		
       List<String> list=new ArrayList<String>(); 

	 list.add ("HCL");
	list.add("Wipro");
    list.add("Aspire System");
    list.add("Cts");
    Collections.sort(list);
    System.out.println(list);
   Collections.reverse(list);
   System.out.println(list);
   
	}

    
}
    
   
    
    
    
    
    
    
	
