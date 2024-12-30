package week1Day3;

public class Browser {
 public String launchBrowser(String browserName) {
	 System.out.println("Browser launched Successfully");
	 return browserName;
 }
 
 void loadUrl() {
	 System.out.println("Application Url Loaded Successfully");
 }
 public static void main(String[] args) {
	 Browser ab=new Browser();
	 String launchBrowser = ab.launchBrowser("chrome");
	 System.out.println(launchBrowser);
	 ab.loadUrl();
	 
	 
 }
}


