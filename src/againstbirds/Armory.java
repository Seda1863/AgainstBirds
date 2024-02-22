
package againstbirds;
import java.util.Random;

/**
 *
 * @author casper
 */
public class Armory extends GroundObjects implements shootable {

    private int numOfBullets;
  private int x;
    public void setNumOfBullets(int numOfBullets) {
        this.numOfBullets = Aircraft.getBullet();
    }

    public void TakeAll() {
        if (Aircraft.shoots(numOfBullets / 10)) {
            Aircraft.increaseBullet();
        }
    }

    public Armory(int numOfBullets) {
        this.numOfBullets=numOfBullets;
        Random rnd = new Random();
        this.x = rnd.nextInt();
        getPos(x);//?
    }

    @Override
    public String ShootMe() {
        
    }
}
