package com.example.utils;

public class ArousalState{
    //cyclic behavior process(temporary)
    //goal=maintain homeostatic regime
    float activationEnergy = 0.0f; // intensity 0.0f<= x <= 1.0f
    boolean valence = true; //The pleasantness of unpleasantness of an emotional stimulus or int? float? 

    public ArousalState(float aE, boolean v){
        this.activationEnergy = aE;
        this.valence = v;
    }
    
    public ArousalState(float aE){
        this.activationEnergy = aE;
        this.valence = true; //default valence is positive if not specified
    }

    public float getActivationEnergy(){
        return activationEnergy;
    }
    
    public boolean getValence(){
        return valence;
    }
    
    public void setActivationEnergy(float aE){
        this.activationEnergy = aE;
    }
    
    public void setValence(boolean v){
        this.valence = v;
    }
    
    public void updateArousalState(float aE, boolean v){
        this.activationEnergy += aE;
        this.valence = v;
    }
    
    public void resetArousalState(){
        this.activationEnergy = 0.0f;
        this.valence = true;
    }
    
    public String toString(){
        return this.getClass().getName();
    }
    
}