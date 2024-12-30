package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutputUsingSelenium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Url of the page
		String title = driver.getTitle();
		System.out.println("Title of the page:" +title);
		//To search book keyword and to click enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book",Keys.ENTER);
		// To print title of the book 
		String text = driver.findElement(By.xpath("//span[text()='A Nation of Idiots']")).getText();
		System.out.println("Title of the book:" +text);
		// To print Price of the book
		String text2 = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println("Price of the book:" +text2 );
		//To replace , into " " 
		String replaceAll = text2.replaceAll(",", " ");
		System.out.println("Replaced Text:"+ replaceAll);
		//String value to integer
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println("Interger Value:" + parseInt);
		// To print current Url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url:" + currentUrl);
		
		driver.close();
		
		
		
		
		
		
		
		
		
  
	}	

}
