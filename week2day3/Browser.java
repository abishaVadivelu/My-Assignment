package week2day3;

public class Browser {
	String browsername;
	float browserversion;
	
	public void openUrl( ) {
		System.out.println("Open the URL");
		
	}
	 public void  closeBrowser() {
		 System.out.println("Close the browser");
	 }
     
	 public void navigateBack() {
		 System.out.println("Navigate Back to thhe browser");
	 }
	 public static void main(String[] args) {
		 Browser B = new Browser();
		 B.openUrl();
		 B.closeBrowser();
		 B.navigateBack();
	 }
}
