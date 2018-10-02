package GameBasics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tichael
 */
enum Affliction {
    NONE, POISON, BURN, FREEZE, CORRODE, STUN, SLEEP, FEAR, BERSERK
}

public class Weapon {
    private String name;
    private double weight, damage;
    private int value, durability;
    private Affliction effect;
    
    public Weapon() {
        this("Some Old Stick");
    }
    
    public Weapon(String name) {
        this(name, 0.0, 6.0, 0);
    }
    
    public Weapon(String name, double weight, double damage, int value) {
        this(name, weight, damage, value, Affliction.NONE);
    }
    
    public Weapon(String name, double weight, double damage, int value, Affliction aff) {
        setName(name);
        setWeight(weight);
        setDamage(damage);
        setValue(value);
        setDurability(100);
        setEffect(aff);
    }
    
    public String getName() { return name; }
    
    public void setName(String newName) {
        if(newName.matches(".*[a-zA-Z0-9_]+.*")) {
            //is a valid name, no symbols
            this.name = newName;
        }
        //If name is invalid, give it the default name/stats
        else this.name = "Some Old Stick"; 
    }
    public int getDurability() { return durability; }
    
    public void setDurability(int dura) {
        this.durability = dura;
    }
    
    public int getValue() { return value; }
    
    public void setValue(int val) {
        this.value = val;
    }
    
    public Affliction getEffect() {
        return this.effect;
    }
    
    public void setEffect(Affliction eff) {
        this.effect = eff;
    }
    
    public double getDamage() {
        return damage; 
        //TODO: add affliction status
    }
    
    public void setDamage(double dam) {
        this.damage = dam;
    }
    
    public double getWeight() { return weight; }
    
    public void setWeight(double wt) {
        this.weight = wt;
    }
}
