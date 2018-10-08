package com.jtai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class All extends Drivers {
    public static void main(String[] args) {
        // write your code here
        WebDriver driver = Drivers.selection("Chrome");
        driver.get("https://login.salesforce.com");
        System.out.println(driver.getTitle()); //get the title of the url
        System.out.println(driver.getCurrentUrl()); //get current url
        System.out.println(driver.getPageSource()); //get page source
        System.out.println(driver.getCurrentUrl()); //get current url
        driver.findElement(By.cssSelector("#username")).sendKeys("Facebook");
        driver.findElement(By.cssSelector("#password")).sendKeys("Blah");
        driver.findElement(By.cssSelector("#Login")).click();
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());
        //xpath and css are commonly used for selenium instead of the other locators.


//        driver.close(); //closes current window
        //driver.quit(); //closes all the browsers opened by selenium script


    }
}
