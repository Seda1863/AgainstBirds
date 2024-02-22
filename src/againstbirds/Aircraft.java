/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package againstbirds;
public abstract class Aircraft extends FlyingObjects implements Moveable{

    static int healthLevel = 1000;
    private static int bullet;
    private static int cureKit;
    private static boolean pharmacyCard=true;
    private boolean infected;

    public Aircraft() {
    }

    public static int getHealthLevel() {
        return healthLevel;
    }

    public static boolean getPharmacyCard() {
        return pharmacyCard;
    }

    public static int getCureKit() {
        return cureKit;
    }

    public static int getBullet() {
        return bullet;
    }

    public void hits(Item a) {
        if (hits()) {
            bullet++;
        }
    }

    public static int increaseBullet() {
        return bullet++;
    }

    public static void shoots() throws IHaveNoBulletsException {
        if (shoots()) {
            bullet--;
        }
        if (bullet == 0){
            throw IHaveNoBulletsException("");
        }
    }

    @Override
    public void move(int a,int b) {
        a = (int) (Math.random() * 2);//only 1 step
        b = (int) (Math.random() * 2);//""
        pos.setX(pos.getX() + a);
        pos.setY(pos.getY() + b);
    }

    public void throwsBulletUp(Enemies a) {
        hits(a);
        Destroy(a);//destroy enemies?
        healthLevel++;
    }

    public void throwsBulletDown(GroundObjects a) {
        hits(a);
        Item.class.getFields();
        //groundobjectin itemlerını toplayacak
        healthLevel++;
    }

    public static void Destroy(Object a) {
        a = null;
    }
public void getItems(GroundObjects a){
    getBullet(a.ıtemGroundObjectsHas)
}

  public void checkCollusion(Enemies enemies) {
       
    }
}
