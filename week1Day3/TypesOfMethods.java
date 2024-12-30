package week1Day3;

public class TypesOfMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Test Leaf";
		String companyName = new String("Test Leaf");
		
		// use length() method
		int length = name.length();
		System.out.println("length of the string:"+ length);
		
		//use contains() method
		boolean contains = name.contains("Test");
		System.out.println("contains method:"+ contains);
		
		//use chartAt() method
		char charAt = name.charAt(5);
		System.out.println("Character of 5th element is:"+ charAt);
		
		//use equals() method
		String value = "Test Leaf";
		if(value.equals(name)) {
			System.out.println("Data is equal");
		}else 
		{
			System.out.println("Data is not equal");
		}
		
		//b/w == and .equals()
		// == -> Check the memory address of the string value
		//.equals() -> check the string content
		
		// use == operator 
		if(value == name)
		{
			System.out.println("Data is equal");
		}else
		{
			System.out.println("Data is not equal");
		}
		
		
		// use EqualsIgnore Case() method
		String d1="Abisha";
		String d2="abisha";
		if(d1.equalsIgnoreCase(d2))
		{
			System.out.println("Data is equal and ignore cases");
		}else
		{
			System.out.println("Data is not equal");
		}
		
		//use charArray() method [ To print each letter in one by one ]
		String val="Selenium";
		char[] charArray = val.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		
		//use charArray() method [ To print the word in same line ]
		String val1="Selenium";
		char[] charArray1 = val1.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
		System.out.print(charArray1[i]);
		}
		//To print the reverse the string in next line we need to use  System.out.println();		
		System.out.println();
		
		//use charArray() method To reverse the string
		String companyName1 = "TestLeaf";
		char[] charArray2 = companyName1.toCharArray();
		for (int i = charArray2.length-1; i>=0; i--) {
		System.out.print(charArray2[i]);
		}
		
		//To print the reverse the string in next line we need to use  System.out.println();		
		System.out.println();
		
		//use toLowerCase() method to convert the string into lower case
		String data = "SELECT class";
		String lowerCase = data.toLowerCase();
		System.out.println("Converted the data into LowerCase:" + lowerCase);
		
		
		//use toUpperCase() method to convert the string into UpperCase
				String data1 = "SELECT class";
				String upperCase = data1.toUpperCase();
				System.out.println("Converted the data into UpperCase:" + upperCase);
				
		//use replace() to replace the letter
				String driver = "Gen Z language";
				String replace = driver.replace('Z', 'X');
				System.out.println("Replaced Letter:" + replace);
				
				
		//use replaceAll() to replace the text in small letter
				String driver1= "AbishaVadivelu";
				String replaceAll = driver1.replaceAll("[a-z]", "V");
				System.out.println("Replaced Text:"+ replaceAll);
				
				
		//use replaceAll() to replace the text in capital letter
		//Numbers will wont be replaced 
				String driver2= "AbishaVadivelu07";
				String replaceAll1 = driver2.replaceAll("[A-Z]", "O");
				System.out.println("Replaced Text:"+ replaceAll1);
				
		//use replaceAll() to replace the both capital and small letter and numbers
				String driver3= "AbishaVadivelu07";
				String replaceAll2 = driver3.replaceAll("[A-Z a-z 0-9]", "O");
				System.out.println("Replaced Text:"+ replaceAll2);
				
		
		//use replaceAll() to replace the special character
				String driver4= "Abisha$@Vadivelu07";
				String replaceAll3 = driver4.replaceAll("[^A-Z a-z 0-9]", "O");
				System.out.println("Replaced Text:"+ replaceAll3);
				
		//use split() method
				String company ="Welcome To Amazon";
				String[] split = company.split(" ");
				for (int i = 0; i < split.length; i++) {
					System.out.println(split[i]);
		//output:welcome
			   //To
			   //Amazon	
		//Remove ln and output will be:WelcomeToAmazon
					
		// we can use the below method to remove the space in the sentence			
		//String replaceAll4 = company.replaceAll("[]", "");
		//System.out.println(replaceAll4);
				 
				}
		
	}
}
		
		        	
					
		
				
				
				
		

	
	


