/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.util.ArrayList;

/**
 *
 * @author nitrosito
 */
public class BadConsequence {
    private ArrayList<TreasureKind> specificHiddenTreasures= new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures= new ArrayList();

    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    public boolean isEmpy(){
        if(death==false && nVisibleTreasures==0 && nHiddenTreasures==0 &&
           death==false && levels==0 && specificHiddenTreasures.size()==0 &&
           specificVisibleTreasures.size()==0){
            return true;
        }
        return false;
    }
    
    
    public int getLevels(){
            return levels;
    }
    
    
    public int getnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    
    public int getnHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return specificVisibleTreasures;
    }
    
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return specificHiddenTreasures;
    }
    
    void substractVisibleTreasure(Treasure t){
        //
    }
    
    void substractHiddenTreasure(Treasure t){
        //
    }
    
    
    public String getText(){
            return text;
    }

    

    
    public boolean getDeath(){
        return death;
    }
    
        
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
            this.text=text;
            this.levels=levels;
            this.nVisibleTreasures=nVisible;
            this.nHiddenTreasures=nHidden;
            this.death=false;
    }
    
    public BadConsequence(String text,boolean death){
        this.text="";
        this.levels=0;
        this.nVisibleTreasures=0;
        this.nHiddenTreasures=0;
        this.text=text;
        this.death=death;
    }
    
        public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
        this.text=text;
        this.levels=levels;
        this.nVisibleTreasures=0;
        this.nHiddenTreasures=0;
        this.specificVisibleTreasures=tVisible;
        this.specificHiddenTreasures=tHidden;
        this.death=false;
    }
        
    BadConsequence adjustToFitTreasureList(ArrayList<TreasureKind> visible, ArrayList<TreasureKind> hidden){
        //
    }
    
    
    public String toString(){
        return "\n Mala Consecuencia \n       Nombre mala consecuencia:" + this.text + "\n       Niveles:" + Integer.toString(this.levels) 
                + "\n       Tesoros Visibles:" + Integer.toString(this.nVisibleTreasures) +
                "\n       Tesoros No Visibles:" + Integer.toHexString(this.nHiddenTreasures) +
                "\n       Muerte:" + this.death;
    }
    
    
        
}
