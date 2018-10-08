package com.jtai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {

    public static WebDriver selection(String selection) {
        WebDriver driver = null;
        if (selection == "Edge") {
            driver = microsoftEdge();
            return driver;
        } else if (selection == "FireFox") {
            driver = fireFox();
            return driver;
        } else if (selection == "Chrome") {
            driver = chrome();
            return driver;
        } else {
            System.out.println("Does not exist");

        }
        return driver;
    }

    public static WebDriver microsoftEdge(){
        String[] microsoftEdge = {"webdriver.edge.driver", "C:\\Users\\JonTai\\Documents\\MicrosoftWebDrivers.exe"};
        driverProperty(microsoftEdge[0], microsoftEdge[1]);
        WebDriver driver = new EdgeDriver();
        return driver;
    }
    public static WebDriver fireFox(){
        String[] fireFox = {"webdriver.gecko.driver", "C:\\Users\\JonTai\\Documents\\geckodriver32.exe"};
        driverProperty(fireFox[0], fireFox[1]);
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
    public static WebDriver chrome(){
        String[] chrome = {"webdriver.chrome.driver", "C:\\Users\\JonTai\\Documents\\chromedriver.exe"};
        driverProperty(chrome[0], chrome[1]);
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static void driverProperty(String driver, String path){
        System.setProperty(driver, path);
    }

}
