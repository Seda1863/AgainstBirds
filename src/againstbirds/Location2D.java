
package againstbirds;
import java.util.Random;

public class Location2D {

    static int dimX;
    static int dimY;
    int x;
    int y;
    Random rnd;

    public static int getDimX() {
        return dimX;
    }

    public static void setDimXY(int dimX, int dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
    }

    public static int getDimY() {
        return dimY;
    }

    public  int getX() {
        return x;
    }

    public  void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Location2D() {
        this.dimX = dimX;
        this.dimY = dimY;
        this.x = x;
        this.y = y;
        Random rnd = new Random();
        x = rnd.nextInt(dimX);
        y = rnd.nextInt(dimY);

    }

    public Location2D(int x, int y, Location2D loc) {
        this.x = x;
        this.y = y;
        x = loc.getX();
        y = loc.getY();
    }

    public void changeLocation(Location2D loc) {
        x = loc.getX();
        y = loc.getY();
    }

    public boolean equals(Location2D loc) {
        return x == loc.getX() && y == loc.getY();
    }

    @Override
    public String toString() {
        return "x= " + x + " y= " + y;
    }
}


