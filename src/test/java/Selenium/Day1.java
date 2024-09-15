package Selenium;

import java.io.File ;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   
		//adding current date
		
		//Date CurrentDate = new Date();
		//System.out.println(CurrentDate);
		//String screenshotfilename = CurrentDate.toString().replace(" "," ").replace(":"," " );
		//System.out.println(screenshotfilename);

		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 		 
          WebElement searchBox = driver.findElement(By.name("q"));	
		  searchBox.sendKeys(" mobiles ");
		  searchBox.submit();
		  //to go next page
		  driver.findElement(By.xpath("//div[text()='₹24,999']/ancestor::div[@class='yKfJKb row']//*[contains(text(),'Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)')]")).click();
		
		 //Screen shot 
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotfilename +".png"));
		
	}

}