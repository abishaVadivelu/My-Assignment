package week3day1;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSize {
   public static void main(String[] args) {
	   
	   ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List<WebElement> OverAll = driver.findElements(By.tagName("a"));
		int size = OverAll.size();
		System.out.println("Size of the elements:"+ size);
		
		for (int i = 0; i < OverAll.size(); i++) {
			System.out.println("Text insize the element:"+ OverAll.get(i).getText());
			
		}
		
		
		WebElement webElement = OverAll.get(1);
		System.out.println("Value print based on Get(0) :"+webElement);
}
}


