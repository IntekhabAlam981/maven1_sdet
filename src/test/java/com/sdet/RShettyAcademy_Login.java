package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RShettyAcademy_Login {
	
	@Test
	public void login_RShettyAcademyTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("atif.mohammad109@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("RShetty@321");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("remember_me")).click();
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());	
		
		Assert.assertEquals(driver.getTitle(),"Just a moment...");
		Thread.sleep(3000);
		
		driver.close();
	}

}
