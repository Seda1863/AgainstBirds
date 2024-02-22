
package againstbirds;
import java.io.FileOutputStream;

public class Pharmacy extends GroundObjects{
    private int numberOfCureKits;

    public Pharmacy(int numberOfCureKits) {
        this.numberOfCureKits=numberOfCureKits;
    }

    public void setNumberOfCureKits(int numberOfCureKits) {
        this.numberOfCureKits = Aircraft.getCureKit();
    }

public void CollectCureKits(){
    Aircraft.getPharmacyCard();
    setNumberOfCureKits(numberOfCureKits++);
}
}
