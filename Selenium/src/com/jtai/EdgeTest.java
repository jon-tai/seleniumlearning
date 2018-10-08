package com.jtai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeTest {

    public static void main(String[] args) {
        // write your code here

        //create driver object
        System.setProperty("webdriver.edge.driver", "C:\\Users\\JonTai\\Documents\\MicrosoftWebDrivers.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");
        System.out.print(driver.getTitle());
    }
}
