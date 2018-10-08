package com.jtai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //create driver object
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JonTai\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.print(driver.getTitle());
    }
}
