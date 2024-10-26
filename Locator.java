package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("99999");
		driver.findElement(By.name("pass")).sendKeys("fhgbvchb");
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
		// tag input -- left to write check by selenium
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(2000);
  //ctr+shift+f
		driver.findElement(By.className("_8esh")).click();
	}

}
