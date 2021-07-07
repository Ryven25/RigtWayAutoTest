import Pages.*;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class InventoryPageTest extends UseCaseBase {

    private static InventoryPage inventoryPage;

    @BeforeAll
    public static void classSetup() {
        inventoryPage = new InventoryPage();
    }

    @BeforeEach
    public void beforeTest() {
        inventoryPage.navigateToInventoryPage();
    }

    @Test
    public void InventoryPageOpenedTest() {
        Boolean success = inventoryPage.isInventoryPageOpen();
        assertTrue(success);
    }

    @Test
    public void openFourteenYearPage() {
        YearsCarsPage yearsCarsPage = inventoryPage.clickFourteenYearTab();
        boolean isFourteenYearOpen = yearsCarsPage.isYearPageOpen();
        assertTrue(isFourteenYearOpen);
    }

    @Test
    public void openElevenYearPage() {
        YearsCarsPage yearsCarsPage = inventoryPage.clickElevenYearTab();
        boolean isElevenYearOpen = yearsCarsPage.isYearPageOpen();
        assertTrue(isElevenYearOpen);
    }

    @Test
    public void openWagonPage() {
        BodyTypePage bodyTypePage = inventoryPage.clickWagonTab();
        boolean isWagonTypeBodyOpen = bodyTypePage.isTypeCarWagonOpen();
        assertTrue(isWagonTypeBodyOpen);
    }

    @Test
    public void openMinivanPage() {
        BodyTypePage bodyTypePage = inventoryPage.clickMinivanTab();
        boolean isMinivanTypeBodyOpen = bodyTypePage.isTypeCarMinivanOpen();
        assertTrue(isMinivanTypeBodyOpen);
    }

    @Test
    public void openKiaPage() {
        MakePage makePage = inventoryPage.clickKiaTab();
        boolean isKiaPageLoaded = makePage.isKiaPageOpen();
        assertTrue(isKiaPageLoaded);
    }

    @Test
    public void openHyundaiPage() {
        MakePage makePage = inventoryPage.clickHyundaiTab();
        boolean isHyundaiPageLoaded = makePage.isHyundaiPageOpen();
        assertTrue(isHyundaiPageLoaded);
    }

    @Test
    public void openFourCylinderPage() {
        EnginePage enginePage = inventoryPage.clickFourCylinderTab();
        boolean isFourCylinderPageLoaded = enginePage.isFourCylinderPageOpen();
        assertTrue(isFourCylinderPageLoaded);
    }

    @Test
    public void openSixCylinderPage() {
        EnginePage enginePage = inventoryPage.clickSixCylinderTab();
        boolean isSixCylinderPageLoaded = enginePage.isSixCylinderPageOpen();
        assertTrue(isSixCylinderPageLoaded);
    }

    @Test
    public void openHyundaiDetailsPage() {
        openHyundaiPage();
        ViewDetailsPage viewDetailsPage = inventoryPage.clickHyundaiDetailsTab();
        boolean isViewDetailsPageLoaded = viewDetailsPage.isDetailsPageOpen();
        assertTrue(isViewDetailsPageLoaded);
    }

    @Test
    public void openDodgeDetailsPage() {
        openElevenYearPage();
        ViewDetailsPage viewDetailsPage = inventoryPage.clickDodgeDetailsTab();
        boolean isDodgeDetailsPageLoaded = viewDetailsPage.isDodgeDetailsOpen();
        inventoryPage.takeScreenshot("DodgeViewDetails");
        assertTrue(isDodgeDetailsPageLoaded);
    }

    @Test
    public void openSortYearPage(){
        SortPage sortPage = inventoryPage.clickSortYearTab();
        boolean isSortYearPageLoaded = sortPage.isYearPageOpen();
        assertTrue(isSortYearPageLoaded);
    }

    @Test
    public void openSortMakeIdPage(){
        SortPage sortPage = inventoryPage.clickSortMakeIdTab();
        boolean isSortMakeIdPageLoaded = sortPage.isYearPageOpen();
        assertTrue(isSortMakeIdPageLoaded);
    }

    @Test
    public void openSortModelPage(){
        SortPage sortPage = inventoryPage.clickSortModelTab();
        boolean isSortModelPageLoaded = sortPage.isYearPageOpen();
        assertTrue(isSortModelPageLoaded);
    }

    @Test
    public void openSortPricePage(){
        SortPage sortPage = inventoryPage.clickSortPriceTab();
        boolean isSortPricePageLoaded = sortPage.isYearPageOpen();
        assertTrue(isSortPricePageLoaded);
    }

    @Test
    public void openSortMileagePage(){
        SortPage sortPage = inventoryPage.clickSortMileageTab();
        boolean isSortMileagePageLoaded = sortPage.isYearPageOpen();
        assertTrue(isSortMileagePageLoaded);
    }

}
