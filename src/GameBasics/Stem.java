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
//Dedicated items class, all items will be called 'Stems' before distinctions

enum StemType { BRANCH, FRUIT, BARK, ROOT, LEAF }

public class Stem {
    private double weight;
    private int value;
    private String name;
    private StemType type;
    
    public Stem() { this(0, 0, "Wood Chip"); }
    
    public Stem(int w) {
        this(w, 0);
    }
    
    public Stem(int w, int v) {
        this(w, v, "Wood Chip");
    }
    
    public Stem(int w, int v, String name) {
        this.weight = w;
        this.value = v;
        this.name = name;
    }
    
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getValue() { return value; }
    public void setValue(int val) {
        this.value = val;
    }
}
