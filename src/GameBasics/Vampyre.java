/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBasics;

/**
 *
 * @author Tichael
 */
public class Vampyre extends Enemy {
    public Vampyre(String name, double health) { super(name, 12, health); }
    
    @Override
    public void takeDamage(int dmg) {
        int actualDmg = dmg / 2;
        super.takeDamage(actualDmg);
    }
}
