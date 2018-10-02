package GameBasics;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tichael
 * Character will cover all interactive beings in the game
 * The player character will be a sub-class of Character 
 */
public class Character {
    private String name;
    private int level, lives;
    private Weapon weapon;
    private double health;
    private int hitCount;
    
    //Multi constructors
    public Character() {
        this("Default Character");
    }
    public Character(String name) {
        this(name, 1);
    }
    public Character(String name, int lv) {
        setName(name);
        setLevel(lv);
        setWeapon(new Weapon());
    }
    public Character(String name, int lv, Weapon weapon) {
        setName(name);
        setLevel(lv);
        setWeapon(weapon);
    }
    
    public String getName() { return this.name; }
    
    public void setName(String newName) {
        if(newName.matches(".*[a-zA-Z0-9_]+.*")) {
            //is a valid name, no symbols
            this.name = newName;
        }
        //if name is invalid, relegate to the existence of a villager
        else setName("Villager");
    }
    
    public int getLevel() { return level; }
    
    public void setLevel(int level) {
        if(level < 0) this.level = 0;
        else if(level > 99) this.level = 100;
        else this.level = level;
    }
    
    public void setNameAndLevel(String name, int level) {
        setName(name);
        setLevel(level);
    }
    
    public int getLives() { return lives; }
    
    public void setLives(int lives) {
        this.lives = lives;
    }
    
    public Weapon getWeapon() { return weapon; }
    
    public void setWeapon(Weapon weapon) {
        setWeapon(weapon);
    }
    
    public void takeDamage() {
        hitCount++;
        if(hitCount > 3) {
            System.out.println("Oh, no! I've fainted!");
            hitCount = 0;
        }
    }
}
