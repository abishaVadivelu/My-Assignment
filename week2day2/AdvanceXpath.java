package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//lable[contains(@name, 'pw')]/input")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//div[@id='login']/input")).click();
		

	}

}
