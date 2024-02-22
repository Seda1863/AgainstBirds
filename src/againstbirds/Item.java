package againstbirds;

public abstract class Item {

    protected Location2D pos;

    public abstract Location2D getPos();
    private int healthLevel = 100;
    private boolean destroyed;

    public Item() {
        if (Aircraft.shoots()) {
            destroyed = true;
        }
        
    if (Enemies.isInfected () ) {
            Aircraft == infected;
        healthLevel = healthLevel - 10;
        if (!Enemies.isInfected()) {
        } else {
            healthLevel = healthLevel - 20;
        }
    }
    }

    public abstract void Move() {
        int r1 = (int) (Math.random() * 2);//only 1 step
        int r2 = (int) (Math.random() * 2);//""
        pos.setX(pos.getX() + r1);
        pos.setY(pos.getY() + r2);

    }

}
