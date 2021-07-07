package Pages;

public class SortPage extends BasePage {
    public static final String
            SORT = "//div[@class='col-md-12']";

    public boolean isYearPageOpen(){
        return elementExist(SORT);
    }
}
