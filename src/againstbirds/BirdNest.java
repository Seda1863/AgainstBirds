
package againstbirds;

import java.util.Random;

/**
 *
 * @author casper
 */
public class BirdNest extends GroundObjects implements shootable {

    private int x;

    public BirdNest() {
        Random rnd = new Random();
        this.x = rnd.nextInt();
        getPos(x);//?
    }


    @Override
    public String ShootMe() {
        if(ShootMe(10)){
            Aircraft.Destroy(this);
        }
    }

}

