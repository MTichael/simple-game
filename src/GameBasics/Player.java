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
public class Player extends Character {
    private int score;
    private ArrayList<Stem> inventory;
    
    //Multi constructors
    public Player() {
        this("Tenet 12");
    }
    public Player(String name) {
        super(name);
        setScore(0);
        inventory = new ArrayList<>();
    }
    
    public int getScore() { return score; }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public ArrayList<Stem> getInventory() { return inventory; }
    
    public void setInventory(ArrayList<Stem> inv) {
        this.inventory = inv;
    }
    
    public void pickFlower(Stem newStem) {
        inventory.add(newStem);
    }

    public boolean dropFlower(Stem loot) {
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }
    
    public boolean dropFlower(String genus) {
        for(Stem petal : inventory) {
            if(petal.getName().equals(genus)) {
                inventory.remove(petal);
                return true;
            }
        }
        return false;
    }
    
    public void showInventory() {
        for(Stem item : inventory) {
            System.out.println(item.getName());
        }
        //Demarcate with Barrier at end
        System.out.println("========================================");
    }
    
    public int score() {
        int total = 0;
        for(int i = 0; i < inventory.size(); i++) {
            Stem curRoot = inventory.get(i);
            System.out.println(curRoot.getName() + " is worth " + curRoot.getValue());
            total += curRoot.getValue();
        }
        return total;
    }
}
