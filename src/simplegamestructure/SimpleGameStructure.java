/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegamestructure;
import GameBasics.*;

/**
 *
 * @author Tichael
 */
public class SimpleGameStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VampyreKing Dracula = new VampyreKing("Dracula");
        Dracula.setLives(9);
        Weapon DraculaWeapon = new Weapon("Dracula's Sword", 0.0, 15.0, 60);
        Dracula.setWeapon(DraculaWeapon);
        Dracula.setLevel(54);
    }
    
}
