package againstbirds;

import java.util.*;

public class Game {

    private Aircraft ac; 
    private ArrayList<Item> items; 
    private Scanner scn = new Scanner(System.in);

    public Game(int dX, int dY, int infCh, int norCh, int ducks) {
      //  items = new int[x][y];
        Location2D.setDimXY(dX, dY);
        ac = new Aircraft();
        items = new ArrayList<>();
        createAllItems(infCh, norCh, ducks);
    }

    private void createAllItems(int infCh, int norCh, int ducks) {
        for (int i = 0; i < infCh; i++) {
            items.add(new Chicken(true)); 
        }
        for (int i = 0; i < norCh; i++) {
            items.add(new Chicken(false)); 
        }
        for (int i = 0; i < ducks; i++) {
            items.add(new Duck());
        }

        items.add(new Pharmacy(5)); 
        items.add(new Armory(50)); 
        items.add(new BirdNest());
        items.add(new BirdNest());

    }

    public void run() {
        GameDisplay.display(items, ac);

        while(!Destroy(ac)){
        while (ac.getHealthLevel() != 0 || checkIfAllDestroyed()) {
            System.out.println("Which direction you move the Aircraft (L:Left,R:Right)?");

            char dim = scn.next().charAt(0);

            if (dim == 'R' || dim == 'r') {
                ac.move(0, 3); //0: move to Right, 3: distance to move
            } else {
                ac.move(1, 3);
            }

            System.out.print("Do you want to throw bullets from the Aircraft to shoot enemies (U: Up, D: Down, S:Skip)?");
            char shootDim = scn.next().charAt(0);
            Enemies a = new Enemies();
            GroundObjects b = new GroundObjects();
            if (shootDim == 'U' || shootDim == 'u') {
                ac.hits(a);
                ac.Destroy(a);
                Aircraft.healthLevel++;
                if (a instanceof Chicken) {
                    Aircraft.healthLevel = (Aircraft.healthLevel * 4);
                }
            } else if (shootDim == 'D' || shootDim == 'd') {
                ac.hits(b);
                b.getItemGroundObjectsHas();
            } else {
                System.out.println("No action for aircraft!");
            }
            if(ac.bullet==0){
                throw IHaveNoBulletsException("Bullet is not enough");
            }

            ac.checkCollusion((Enemies) Item); 
            GameDisplay.display(items, ac);
            printPositions();
        }
        }
    }

    private boolean checkIfAllDestroyed() {
        boolean allDestroyed = true;
        for (Item item : items) {
            if (item instanceof Enemies) {
                if (!((Enemies) item).destroyed) {
                    allDestroyed = false;
                }
            }
        }

        return allDestroyed;
    }

    private void printPositions() { //this method is written for debugging purpose
        System.out.println("AC position: " + ac.getPos().getX());
        System.out.println("AC position: " + ac.getPos().getY());

        for (Item item : items) {
            System.out.println(item.getClass().getName());
            System.out.println("position: " + item.getPos().getX());
            System.out.println("position: " + item.getPos().getY());
        }
    }

}
