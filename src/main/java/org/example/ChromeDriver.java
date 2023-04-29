package org.example;

import org.openqa.selenium.WebDriver;

public class ChromeDriver {
    public ChromeDriver() {
    }

    public WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        return driver;
    }
}
