package week1day2;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1, 4,3,2,8, 6, 7};
 int num1 = 0;
 for(int i=0;i<a.length;i++)
 {
	 num1=num1+a[i];
	
 }
 System.out.println("sum of the elements in array:" +num1);
 
 int num2 =0;
 for(int i=1;i<=8;i++)
 {
	 num2=num2+i;
	 
 }
 System.out.println("sum of range of the elements in array:" +num2);
 System.out.println("Missing Number is:" + (num2-num1));
	}
	

}
