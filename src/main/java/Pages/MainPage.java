package Pages;

import Consts.Consts;


public class MainPage extends BasePage {

    private static final String
            MAIN_PAGE = "//h2[text()='Vehicles we offer']",
            CONTACT_US_BUTTON = "//a[text() = 'Contact Us']",
            INVENTORY_BUTTON = "//a[text() = 'Inventory']";



    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_PAGE_URL);
    }

    public boolean isMainPageLoaded() {
        Boolean isLoaded = elementExist(MAIN_PAGE);
        return isLoaded;
    }

    public ContactUsPage clickContactUsButton() {
        clickElementByXpath(CONTACT_US_BUTTON);
        return new ContactUsPage();
    }

    public InventoryPage clickInventoryButton() {
        clickElementByXpath(INVENTORY_BUTTON);
        return new InventoryPage();
    }

}
