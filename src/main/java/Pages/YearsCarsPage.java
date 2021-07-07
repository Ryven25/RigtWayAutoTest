package Pages;

public class YearsCarsPage extends BasePage {

    public static final String
            CARS_YEARS = "//div[@class = 'list-view']";


    public boolean isYearPageOpen() {
        return elementExist(CARS_YEARS);
    }
}
