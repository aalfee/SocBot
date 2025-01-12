// Repackaged the ArousalState object and controller into their own folder and updated packages in their code as well as the import in main
// Compiled both the utils packages and main using 
// When inside the srs directory use javac .*filepath to utils and arousal with \*.java
// When inside the srs directory use javac .*\filepath to example\*.java"
// When inside the java directory use "java com.example.Main" to run 
// Save, git add . , git commit -m "Repackaged the ArousalState object and controller into their own folder and updated packages in their code as well as the import in main" , git push -u origin main 
package com.example;

import com.example.utils.arousal.ArousalState;
import com.example.utils.arousal.ArousalStateController;

public class Main{
    public static void main(String [] args){
        ArousalState BoredState;
        ArousalStateController BoredController = new ArousalStateController(); 

        BoredState = new ArousalState(0.8f);
        boolean answer = BoredController.assessValence(BoredState);
        System.out.println("The valence is " + answer); // should be false, originally set to true
    }
}