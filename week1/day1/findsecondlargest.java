package week1.day1;
import java.util.Arrays;

public class findsecondlargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		int secondlargest =data.length-2;
		System.out.println(data[secondlargest]);
		
		// TODO Au dtato-generated method stub

	}

}
