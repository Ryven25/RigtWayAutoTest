package Pages;

import Consts.Consts;

public class InventoryPage extends BasePage {
    public static final String
            INVENTORY_PAGE = "//h2[@class = 'mb20 sub-heading-2']",
            FOURTEEN_YEAR_TAB = "//a[text() = '2014']",
            ELEVEN_YEAR_TAB = "//a[text() = '2011']",
            WAGON_TAB = "//a[text()='Wagon']",
            MINIVAN_TAB = "//a[text()='Minivan-Van']",
            KIA_TAB = "//a[text()='Kia']",
            HYUNDAI_TAB = "//a[text()='Hyundai']",
            FOUR_CYLINDER_TAB = "//a[text()='4 Cylinder Engine']",
            SIX_CYLINDER_TAB = "//a[text()='6 Cylinder Engine']",
            HYUNDAI_VIEW_TAB = "//div[@data-key ='419']//following::a[@class='view-detail-btn ']",
            DODGE_VIEW_TAB = "//div[@data-key ='416']//following::a[@class='view-detail-btn ']",
            SORT_YEAR_TAB = "//a[@data-sort='year_id']",
            SORT_MAKE_TAB = "//a[@data-sort='make_id']",
            SORT_MODEL_TAB = "//a[text()='Model']",
            SORT_PRICE_TAB = "//a[text()='Price']",
            SORT_MILEAGE_TAB = "//a[text()='Mileage']";


    public boolean isInventoryPageLoaded() {
        return elementExist(INVENTORY_PAGE);
    }

    public void navigateToInventoryPage() {
        webDriver.get(Consts.INVENTORY_PAGE_URL);
    }

    public boolean isInventoryPageOpen() {
        Boolean isPageOpen = elementExist(INVENTORY_PAGE);
        return isPageOpen;
    }


    public YearsCarsPage clickFourteenYearTab() {
        clickElementByXpath(FOURTEEN_YEAR_TAB);
        return new YearsCarsPage();
    }


    public YearsCarsPage clickElevenYearTab() {
        clickElementByXpath(ELEVEN_YEAR_TAB);
        return new YearsCarsPage();
    }

    public BodyTypePage clickWagonTab() {
        clickElementByXpath(WAGON_TAB);
        return new BodyTypePage();
    }

    public BodyTypePage clickMinivanTab() {
        clickElementByXpath(MINIVAN_TAB);
        return new BodyTypePage();
    }

    public MakePage clickKiaTab() {
        clickElementByXpath(KIA_TAB);
        return new MakePage();
    }

    public MakePage clickHyundaiTab() {
        clickElementByXpath(HYUNDAI_TAB);
        return new MakePage();
    }

    public EnginePage clickFourCylinderTab() {
        clickElementByXpath(FOUR_CYLINDER_TAB);
        return new EnginePage();
    }

    public EnginePage clickSixCylinderTab() {
        clickElementByXpath(SIX_CYLINDER_TAB);
        return new EnginePage();
    }

    public ViewDetailsPage clickHyundaiDetailsTab() {
        clickElementByXpath(HYUNDAI_VIEW_TAB);
        return new ViewDetailsPage();
    }

    public ViewDetailsPage clickDodgeDetailsTab() {
        clickElementByXpath(DODGE_VIEW_TAB);
        return new ViewDetailsPage();
    }

    public SortPage clickSortYearTab() {
        clickElementByXpath(SORT_YEAR_TAB);
        return new SortPage();
    }

    public SortPage clickSortMakeIdTab() {
        clickElementByXpath(SORT_MAKE_TAB);
        return new SortPage();
    }

    public SortPage clickSortModelTab() {
        clickElementByXpath(SORT_MODEL_TAB);
        return new SortPage();
    }

    public SortPage clickSortPriceTab() {
        clickElementByXpath(SORT_PRICE_TAB);
        return new SortPage();
    }

    public SortPage clickSortMileageTab() {
        clickElementByXpath(SORT_MILEAGE_TAB);
        return new SortPage();
    }
}
