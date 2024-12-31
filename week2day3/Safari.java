package week2day3;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Chage the option to read mode in safari");
	}
	public void fullScreenMode() {
		System.out.println("Select the fullscreen mode option");
	}
    public static void main(String[] args) {
    	Safari S=new Safari();
    	S.fullScreenMode();
    	S.readerMode();
    	S.closeBrowser();
    	S.navigateBack();
    	S.openUrl();
    }
}
