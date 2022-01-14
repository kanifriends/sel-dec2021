package week3.day1;

public class AndroidPhone extends Smartphone {
	
	

public void takeVideo() {
	System.out.println("video is on");
	
}
public static void main(String[] args) {
	AndroidPhone phone=new AndroidPhone();
	//Smartphone obj=new Smartphone();
	
	phone.accessWhatsApp();
	phone.takeVideo();
	phone.makecall();
	phone.savecontact();
	phone.sendmsg();
	
}
}