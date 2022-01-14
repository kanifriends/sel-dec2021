package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindIntersection {
	public static void main (String[] args) {
		int[] s1= {3,2,11,4,6,7};
		int[] s2= {1,2,8,4,9,7};
	List list1=new ArrayList();
	List list2=new ArrayList();
	for(int i=0;i<s1.length;i++) {
		list1.add(s1[i]);
	}
	for(int j=0;j<s2.length;j++) {
	list2.add(s2[j]);
	}
	Collections.sort(list1);
	Collections.sort(list2);
	
	
list1.retainAll(list2);
System.out.println(list1);
}
	}
