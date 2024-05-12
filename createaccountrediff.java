package com.createaccountrediff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class createaccountrediff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"," C:\\Users\\thasleem\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.rediff.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//a[normalize-space()='Create Account']"));
		if(e.isDisplayed())
		{
			System.out.print("element is displayed"+'\n');
		}
		else
			System.out.print("element is not displayed"+'\n');

		if(e.isEnabled())
		{
			System.out.print("element is enabled"+'\n');

		}
		else
			System.out.print("element is not enabled"+'\n');
		driver.findElement(By.xpath("//a[normalize-space()='Create Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("mohammad ameer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("ameer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).click();
		WebElement l1=driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		l1.click();
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[8]"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("value"));
			int x=list.size();
			if(i==list.size()) {
				list.get(i).click();
				
			}
		}
		
		driver.findElement(By.xpath("//tbody/tr[9]/td[3]/input[1]")).sendKeys("Ameer@241");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[11]/td[3]/input[1]")).sendKeys("Ameer@241");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("tashutasleem34@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[15]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();
		Thread.sleep(3000);
		WebElement securityEle=driver.findElement(By.xpath("//tbody/tr[2]/td[3]/select[1]"));
		Select securityDropdown=new Select(securityEle);
		securityDropdown.selectByVisibleText("What is your favourite food?");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[16]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/input[1]")).sendKeys("Biriyani");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[6]/td[3]/input[1]")).sendKeys("Shaik");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9059590301");
		Thread.sleep(3000);
		WebElement dateEle=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		Select dateDropdown=new Select(dateEle);
		dateDropdown.selectByIndex(9);
		Thread.sleep(3000);
		WebElement monthEle=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		Select monthDropdown=new Select(monthEle);
		monthDropdown.selectByValue("07");
		Thread.sleep(3000);
		WebElement yearEle=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		Select yearDropdown=new Select(yearEle);
		yearDropdown.selectByValue("1993");
		Thread.sleep(3000);
		WebElement countryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select countryDropdown=new Select(countryEle);
		countryDropdown.selectByValue("99");
		


	}
}

