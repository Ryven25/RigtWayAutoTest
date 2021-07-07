package Pages;

public class EnginePage extends BasePage{

    public static final String
           FOUR_CYLINDER="//span[text()='4 Cylinder Engine']",
           SIX_CYLINDER="//span[text()='6 Cylinder Engine']";

    public boolean isFourCylinderPageOpen(){
        return elementExist(FOUR_CYLINDER);
    }
    public boolean isSixCylinderPageOpen(){
        return elementExist(SIX_CYLINDER);
    }
}
