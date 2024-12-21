package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountWithSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Abishavadivelu");
			driver.findElement(By.id("groupNameLocal")).sendKeys("Abisha V");
			driver.findElement(By.id("annualRevenue")).sendKeys("4 LPA");
			driver.findElement(By.name("industryEnumId")).sendKeys("Computer Hardware");
			driver.findElement(By.name("ownershipEnumId")).sendKeys("corporation");
			driver.findElement(By.id("sicCode")).sendKeys("637001");
			driver.findElement(By.name("dataSourceId")).sendKeys("Other");
			driver.findElement(By.id("initialTeamPartyId")).sendKeys("Demo Sales No.1");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.name("parentPartyId")).sendKeys("None");
			driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			driver.findElement(By.id("numberEmployees")).sendKeys(" 5 ");
			driver.findElement(By.id("marketingCampaignId")).sendKeys("Automobile");
			driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("637001");
			driver.findElement(By.id("primaryEmail")).sendKeys("abishavadivelu@gmail.com");
			driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9994565977");
			driver.findElement(By.id("generalToName")).sendKeys("Abisha Vadivelu");
			driver.findElement(By.id("generalAttnName")).sendKeys("Abisha");
			driver.findElement(By.id("generalAddress1")).sendKeys("3/98,Annai Sathya Nagar");
			driver.findElement(By.id("generalAddress2")).sendKeys("N.kosavampatty");
			driver.findElement(By.id("generalCity")).sendKeys("Namakkal");
			driver.findElement(By.id("generalPostalCode")).sendKeys("637001");
			driver.findElement(By.name("generalStateProvinceGeoId")).sendKeys("New York");
			driver.findElement(By.className("smallSubmit")).click();
			
	}

}
