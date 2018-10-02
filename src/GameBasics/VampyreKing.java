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
public class VampyreKing extends Vampyre {
    public VampyreKing(String name) {
        super(name, 140.2);
        setLevel(54);
    }
    
    @Override
    public void takeDamage(int dmg) {
        int actualDmg = dmg / 2;
        super.takeDamage(actualDmg);
    }
    
    @Override
    public void takeDamage() {
        System.out.println("*Chink* ...No Damage Taken!");
    }
   
}
