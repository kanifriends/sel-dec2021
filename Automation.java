package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{
	
	
	 public void Java(){
	 System.out.println("java complete");
	 }
	 
	 public void Selenium() {
		 System.out.println("Selenium completed");
		 
	 }
	 public void python() {
	    	System.out.println("phython implemented");
	    }
	    public void ruby() {
	    	System.out.println("ruby unimplemeted");
	    }
	 
	 
	public static void main(String[] args) {
		 Automation obj=new Automation();
		 obj.Java();
		 obj.python();
		 obj.ruby();
		 obj.Selenium();
		// TODO Auto-generated method stub

	}

}
