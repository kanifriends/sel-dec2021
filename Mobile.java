package week3.day1;

public class Mobile {
	
	
	
public void sendmsg() {
	System.out.println("sendmsg=hi");
	
}

public void makecall(){
	System.out.println("makecall=hello");

}
public void savecontact() {
	System.out.println("savecontct=kani");
}
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.sendmsg();
		mobile.makecall();
		mobile.savecontact();
	}
}