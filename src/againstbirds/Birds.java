/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package againstbirds;
public abstract class Birds extends Enemies{
      public static boolean avaible(BirdNest a){
      if(a!=null){
          return true;
      }
          return false;
  }
}
