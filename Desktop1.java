package week3.day2;

public class Desktop1 implements Software {
	
	public void deskTopModel(){
System.out.println("model is dell");
	}
	
	public void hardwareResources() {
		System.out.println("hardware resuroce");
		// TODO Auto-generated method stub
		
	}

	public void softwareResuroces() {
		System.out.println("softwareresuroces");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Desktop1 desk=new Desktop1();
	    desk.hardwareResources();
	     desk.softwareResuroces();
	     desk.deskTopModel();
		}

	}


