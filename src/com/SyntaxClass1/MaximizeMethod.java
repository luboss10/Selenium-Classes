package com.SyntaxClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        driver.manage().window().maximize(); //to maximize browser window
        driver.manage().window().fullscreen(); // to have a full screen window of browser
    }
}
