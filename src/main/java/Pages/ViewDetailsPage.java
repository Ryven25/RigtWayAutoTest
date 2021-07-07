package Pages;

public class ViewDetailsPage extends BasePage {
    public static final String
            HYUNDAI_ELANTRA = "//h1[text()='2013 Hyundai Elantra GLS | SAFETY CERTIFIED']",
            DODGE_CARAVAN_SXT =  "//*[text()='2011 Dodge Grand Caravan SXT | LOW KMS | SAFETY CERTIFIED']";

    public boolean isDetailsPageOpen() {
        return elementExist(HYUNDAI_ELANTRA);
    }

    public boolean isDodgeDetailsOpen(){
        return elementExist(DODGE_CARAVAN_SXT);
    }
}
