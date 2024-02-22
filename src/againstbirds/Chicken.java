
package againstbirds;

import java.util.Random;

public  class Chicken extends Birds {

    private static int numOfİnfected;
    private static int numOfUnİnfected;
    private int x;
    private boolean avaible = Birds.avaible();
    public Chicken(boolean  avaible) {
        this.avaible=avaible;
        Random rnd = new Random();
        this.x = rnd.nextInt();
        getPos(x);

    }



    static boolean isInfected() {
        if (isInfected()) {
            numOfİnfected++;
        } else {
            numOfUnİnfected++;
        }
        return false;
    }

    public static int getNumOfİnfected() {
        return numOfİnfected;
    }

    public static int getNumOfUnİnfected() {
        return numOfUnİnfected;
    }

    @Override
    public  ShootMe(int par) {
 if(ShootMe(4)||isInfected()){
     destroyed=true;
 }
        
    }

}
