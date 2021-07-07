package Pages;

public class BodyTypePage extends BasePage{
    public static final String
            WAGON = "//span[text()='Wagon']",
            MINIVAN = "//span[text()='Minivan-Van']";

    public boolean isTypeCarWagonOpen(){
        return elementExist(WAGON);
    }

    public boolean isTypeCarMinivanOpen(){
        return elementExist(MINIVAN);
    }
}
