package Pages;

public class ContactUsPage extends BasePage {
    public static final String
            CONTACT_US_PAGE = "//div[@class = 'page-header-area']";


    public boolean isPageTitleVisible() {
        return elementExist(CONTACT_US_PAGE);
    }
}
