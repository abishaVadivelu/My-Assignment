package week2day3;

public class Polymorphism {
	public void reportStep(String message,String Status) {
		System.out.println(message + Status);
	}
	public void reportStep(String message,String Status,String snap) {
		System.out.println(message + Status+ snap);
	}
	
	public static void main(String[] args) {
		Polymorphism P = new Polymorphism();
		P.reportStep("HAI", "Abisha");
		P.reportStep("Good", "Nice", "snap");
	}
}
