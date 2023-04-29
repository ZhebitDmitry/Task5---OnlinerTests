package org.example.ForCatalogTitles;

import org.example.Driver.ChromeDriverCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActualList {
    public ActualList() {
    }

    public static List createdActualList(WebDriver driver) {
        driver = ChromeDriverCreator.getChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");

        List<WebElement> webelements;
        List<String> textOfWebElements = new ArrayList();
        webelements = driver.findElements(By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper']"));
        webelements.stream().peek(el -> textOfWebElements.add(el.getText())).collect(Collectors.toList());

        driver.quit();
        return textOfWebElements;
    }
}
