package org.example.ForComponentsOfComputer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComponentsOfComputers {
    public static List createTitlesOfComponents(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        List<WebElement> titlesOfComponents = driver.findElements(By.xpath("//div[text()=\" Комплектующие \"]/following-sibling::*//a/span/span[@class='catalog-navigation-list__dropdown-title']"));
        return titlesOfComponents;
    }

    public static List createDescriptionOfComponents(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        List<WebElement> descriptionOfComponents = driver.findElements(By.xpath("//div[text()=\" Комплектующие \"]/following-sibling::*//a/span/span[@class='catalog-navigation-list__dropdown-description']"));
        return descriptionOfComponents;
    }

    public static List createCatalogNavigationList(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        List<WebElement> catalogNavigationList = driver.findElements(By.xpath("//div[text()=\" Комплектующие \"]/following-sibling::*//a"));
        return catalogNavigationList;
    }
}
