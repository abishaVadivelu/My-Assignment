package week2day3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Print the end point of the string" + endpoint );
		
	}
	public void sendRequest(String endpoint,String requestBody , boolean requestStatus) {
		System.out.println("Print the end point of the string" + endpoint );
		System.out.println("Print the requestBody of the string" + requestBody );
		System.out.println("Print the requestStatus of the string" + requestStatus );
	}
	
	
	public static void main(String[] args) {
		APIClient API = new APIClient();
		API.sendRequest("Abisha Vadivelu");
		API.sendRequest("Abisha Vadivelu", "Anu", false);
	}

}
