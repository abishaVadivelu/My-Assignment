package week2day3;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("Open the incognito in chrome");
	}
	public void clearCache() {
		System.out.println("Clear the Cache in incognito");
	}
	
	public static void main(String[] args) {
		Chrome C = new Chrome();
		C.clearCache();
		C.closeBrowser();
		C.openIncognito();
		C.navigateBack();
		C.openUrl();
	}

}
