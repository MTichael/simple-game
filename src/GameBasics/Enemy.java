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
public class Enemy extends Character {
    private double health, maxHP;
    
    public Enemy(String name, int level) {
        super(name, level);
        setMaxHP();
        this.health = this.maxHP;
    }
    public Enemy(String name, int level, double startingHitPoints) {
        super(name, level);
        setMaxHP(startingHitPoints);
        this.health = this.maxHP;
    }
    public Enemy(String name, int level, double startingHitPoints, int lives) {
        super(name, level);
        setMaxHP(startingHitPoints);
        this.health = this.maxHP;
        setLives(lives);
    }
    
    public void showInfo() {
        System.out.println("Name: " + getName() + 
                " Hitpoints: " + getHealth() + 
                " Lives: " + getLives()
        );
    }
    
    public void setMaxHP() {
        this.maxHP = 28 + this.getLevel() * 5.4;
    }
    public void setMaxHP(double HP) {
        this.maxHP = HP;
    }
    
    public double getHealth() {
        return this.health;
    }
    
    @Override
    public void takeDamage() {
        this.health--;
    }
    public void takeDamage(int dmg) {
        this.health -= dmg;
    }
}
