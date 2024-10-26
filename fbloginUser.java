package com.fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class fbloginUser {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    	System.out.println("please enter phone number");
    	String un=sc.next();
       	System.out.println("please enter password");
       	String pw=sc.next();
       	
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        
     driver.findElement(By.id("email")).sendKeys(un);
     driver.findElement(By.name("password")).sendKeys(pw);
     driver.findElement(By.name("login")).click();
    }
}


