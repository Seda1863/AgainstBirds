
package againstbirds;

import java.util.Random;

public class Duck extends Birds {

    private int x;
    private static int numOfİnfected;
    private static int numOfUnİnfected;
    private boolean avaible = Birds.avaible();

    public Duck(Aircraft a) {
        Random rnd = new Random();
        this.x = rnd.nextInt();
        if (Aircraft.Destroy(this)) {
            a.healthLevel *= 4;
        }
        getPos(x);
    }
        static boolean isInfected() {
        if (isInfected()) {
            numOfİnfected++;
        } else {
            numOfUnİnfected++;
        }
    }

    public static int getNumOfİnfected() {
        return numOfİnfected;
    }

    public static int getNumOfUnİnfected() {
        return numOfUnİnfected;
    }

    Duck() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ShootMe() {
      
    }

}