package org.example.ForComputersAndNetworks;

import org.example.Driver.ChromeDriverCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLIstComputersAndNetworks {
    public GetLIstComputersAndNetworks() {
    }

    public boolean createdActualListComputersAndNetworks(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        WebElement computersAndNetworkSection = driver.findElement(By.xpath("//li[@data-id='2']"));
        computersAndNetworkSection.click();
        Thread.sleep(2000);
        WebElement listComputersAndNetwork = driver.findElement(By.xpath("//div[@class='catalog-navigation-list__wrapper']"));
        boolean isVisible = listComputersAndNetwork.isDisplayed();
        driver.quit();
        return isVisible;
    }
}
