import org.example.Driver.ChromeDriverCreator;
import org.example.ForCatalogTitles.ActualList;
import org.example.ForCatalogTitles.ExpectedList;
import org.example.ForComponentsOfComputer.ComponentsOfComputers;
import org.example.ForComputersAndNetworks.GetLIstComputersAndNetworks;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TestOnliner {
    static WebDriver driver;

    @BeforeAll
    public static void getWebDriver() {
        driver = ChromeDriverCreator.getChromeDriver();
    }

    @Test
    public void firstTest() {
        List myExpectedList = ExpectedList.createExpectedList();
        List myActualLIst = ActualList.createdActualList(driver);
        Assertions.assertEquals(myExpectedList, myActualLIst);
    }

    @Test
    public void secondTest() throws InterruptedException {
        GetLIstComputersAndNetworks lIstComputersAndNetworks = new GetLIstComputersAndNetworks();
        Assertions.assertTrue(lIstComputersAndNetworks.createdActualListComputersAndNetworks(driver));
    }

    @Test
    public void thirdTest() {
        Assertions.assertTrue(ComponentsOfComputers.createDescriptionOfComponents(driver).size()
                == ComponentsOfComputers.createCatalogNavigationList(driver).size() &&
                ComponentsOfComputers.createTitlesOfComponents(driver).size()
                        == ComponentsOfComputers.createCatalogNavigationList(driver).size());
    }

    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }
}
