package com.example;

import com.example.utils.ArousalState;
import com.example.utils.ArousalStateController;

public class Main{
    public static void main(String [] args){
        ArousalState BoredState;
        ArousalStateController BoredController = new ArousalStateController(); 

        BoredState = new ArousalState(0.8f);
        boolean answer = BoredController.assessValence(BoredState);
        System.out.println("The valence is " + answer); // should be false, originally set to true
    }
}