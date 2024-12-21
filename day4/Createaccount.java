package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createaccount {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.partialLinkText("Account")).click();
			driver.findElement(By.partialLinkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Abishavadivelu");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.id("numberEmployees")).sendKeys("10");
			driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			driver.findElement(By.className("smallSubmit")).click();
			
			Thread.sleep(8000);
			driver.close();

	}

}
