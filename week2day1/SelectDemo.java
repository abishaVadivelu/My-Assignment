package week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.telerik.com/contact");
				WebElement dd= driver.findElement(By.id("Dropdown-1"));
		        Select op=new Select(dd);
			    op.selectByIndex(5);
			    WebElement dd1 =driver.findElement(By.id("Dropdown-2"));
			    Select op1=new Select(dd1);
			    op1.selectByValue("UI for WinForms");
			    WebElement dd2 =driver.findElement(By.id("Country-1"));
			    Select op3=new Select(dd2);
			    op3.selectByVisibleText("India");		
			    
			    
			    		
			    

		}

	}


