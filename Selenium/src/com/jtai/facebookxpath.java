package com.jtai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebookxpath extends Drivers{

    public static void main(String[] args) {
        // write your code here
        WebDriver driver = Drivers.selection("FireFox");
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle()); //get the title of the url
        System.out.println(driver.getCurrentUrl()); //get current url
        System.out.println(driver.getPageSource()); //get page source
        System.out.println(driver.getCurrentUrl()); //get current url
//        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("myblahblah");
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Blah");
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();


        driver.findElement(By.cssSelector("*[name='email']")).sendKeys("myblahblah");
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Blah");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
//        System.out.println(driver.findElement(By.cssSelector("#error")).getText());
        //xpath and css are commonly used for selenium instead of the other locators.


//        driver.close(); //closes current window
        //driver.quit(); //closes all the browsers opened by selenium script


    }
}
