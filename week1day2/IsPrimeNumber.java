package week1day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num = 1;
 for(int i = 2; i<num; i++) {
	 if(num% i ==0) {
		 System.out.println("Primenumber:" + num);
		 return;
	 }
 }
	 
 System.out.println("Not a Primenumber:" + num);	 
	}

}
