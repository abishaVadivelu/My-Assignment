package week2day3;

public class TestData {

	public void enterCredentials() {
		System.out.println("Enter the enterCredentials to login");
	}
	
	public void navigateToHomePage() {
		System.out.println("navigateToHomePage in the tab");
	}
	public static void main(String[] args) {
		TestData TD =new TestData();
		TD.enterCredentials();
		TD.navigateToHomePage();
	}
}
