package week1.day2;

import java.util.Arrays;

public class missingelement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
	if(arr[i]!=(i+1)) {
	
		System.out.println( "the missing element"+(i+1));
		break;
				
	}
		// TODO Auto-generated method stub

	}
	}}
	
