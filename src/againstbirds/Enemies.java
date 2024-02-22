package againstbirds;

public abstract class Enemies extends FlyingObjects implements shootable,Moveable {

    private static int numOfİnfected;
    private static int numOfUnİnfected;
    boolean destroyed;

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

}
