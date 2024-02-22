/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package againstbirds;

import java.util.ArrayList;

public abstract class GroundObjects extends Item{
    ArrayList<Item> ıtemGroundObjectsHas = new ArrayList<>();
    public void getPos() {
        return pos;
        pos.getDimY()==null;
     }

    public ArrayList<Item> getItemGroundObjectsHas() {
        return ıtemGroundObjectsHas;
    }
    
}
