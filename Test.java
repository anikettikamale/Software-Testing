package com.fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();	
driver.get("https://login.salesforce.com/");
//driver.findElement(By.cssSelector("input#username")).sendKeys("99999");
//// cssSelector - tagname+#id ---> by id 

////cssSelector - tagname+.classname --> by class

////console --> $('css selector')

//driver.findElement(By.cssSelector("input.password")).sendKeys("ddkfjg");
//
//driver.findElement(By.cssSelector("input.password")).sendKeys("ddkfjg");
//

////by generics= tagname[attribute='value']
//

//driver.findElement(By.cssSelector("input[type='email']")).clear();
//
//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("7645786");
//driver.findElement(By.cssSelector("input[name='Login']")).click();
//

//// x ---> path = locator --> and // and @ 

driver.findElement(By.xpath("//input[@id='username']")).sendKeys("7645786");


driver.findElement(By.cssSelector("input[class*=password]")).sendKeys("hhgh");

// CSS selector by using regular expression 
//input[class*=password] = add * before = 
	}

}
