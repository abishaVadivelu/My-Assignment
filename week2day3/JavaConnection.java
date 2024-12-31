package week2day3;

public class JavaConnection {
	public void connect() {
		System.out.println("Connect the video call");
	}
public void disconnect() {
	System.out.println("disConnect the video call");
}
public void executeUpdate() {
	System.out.println("executeUpdate the video call");
}

public static void main(String [] args) {
	JavaConnection J = new JavaConnection();
	J.connect();
	J.disconnect();
	J.executeUpdate();
}
}
