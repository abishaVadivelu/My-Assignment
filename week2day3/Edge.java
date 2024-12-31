package week2day3;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Take a snapshot of edge browser");
	}
    
	public void clearCookies() {
		System.out.println("Clear cookies of  edge browser");
	}
	
	public static void main(String[] args) {
		Edge E= new Edge();
		E.clearCookies();
		E.takeSnap();
		E.openUrl();
		E.closeBrowser();
		E.navigateBack();
	}
	

}
