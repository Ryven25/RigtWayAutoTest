import Pages.ContactUsPage;
import Pages.InventoryPage;
import Pages.MainPage;
import Pages.YearsCarsPage;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainPageTest extends UseCaseBase {

    private static MainPage mainPage;


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }


    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void MainPageLoadedTest() {
        Boolean success = mainPage.isMainPageLoaded();
        assertTrue(success);
    }


    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.clickContactUsButton();
        boolean isContactUsPageLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isContactUsPageLoaded);
    }

    @Test
    public void openInventoryPage() {
        InventoryPage inventoryPage = mainPage.clickInventoryButton();
        boolean isInventoryPageLoaded = inventoryPage.isInventoryPageLoaded();
        assertTrue(isInventoryPageLoaded);
    }


}
