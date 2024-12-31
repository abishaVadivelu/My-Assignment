package week2day3;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter the user name correctly");
	}
	public void enterPassword() {
		System.out.println("Enter the Password correctly");
	}
	
	public static void main(String[] args) {
		LoginTestData LTD =new LoginTestData();
		LTD.enterCredentials();
		LTD.navigateToHomePage();
		LTD.enterUsername();
		LTD.enterPassword();

}
}
