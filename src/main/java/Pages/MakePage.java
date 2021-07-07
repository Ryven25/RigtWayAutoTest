package Pages;

public class MakePage extends BasePage {
    public static final String
            KIA = "//span[text()='Kia']",
            HYUNDAI = "//span[text()='Hyundai']";

    public boolean isKiaPageOpen() {
        return elementExist(KIA);
    }

    public boolean isHyundaiPageOpen() {
        return elementExist(HYUNDAI);
    }

}
