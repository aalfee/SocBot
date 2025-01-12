package com.example.utils.arousal;

public class ArousalStateController {
    static float homeostaticLow = 0.3f;  //excluded
    static float homeostaticHigh = 0.7f; //included
    static float overwhelmedLow = 0.0f;  //included
    static float overwhelmedHigh = 0.3f; //included
    static float understimulatedLow = 0.7f; //excluded
    static float understimulatedHigh = 1.0f; //included
    private boolean valence = true;

    public ArousalStateController(){
        System.out.println("Arousal State Controller created.");
    }

    public boolean assessValence(ArousalState state){
        float arousalValue = state.getActivationEnergy();
        // check Arousal value is in range 
        if(arousalValue < 0.0f && arousalValue > 1.0f) { System.out.println("Arousal Value out of Range"); return true;
        // defining ranges and returning positive or negative valences
        } else if(arousalValue > homeostaticLow && arousalValue <= homeostaticHigh){
            // homeostatic state
            setValence(true);
            return getValence();
        } else if(arousalValue >= overwhelmedLow && arousalValue <= overwhelmedHigh){
            // overwhelmed state
            setValence(false);
            return getValence();
        } else if(arousalValue >= understimulatedLow && arousalValue < understimulatedHigh){
            // understimulated state
            setValence(false);
            return getValence();
        } 
        
        return true;
    }

    public boolean getValence(){
        return valence;
    }
    public void setValence(boolean v){
        valence = v;
    }
}