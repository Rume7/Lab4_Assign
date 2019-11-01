package com.jerryassignment.run;

import com.jerryassignment.view.DrawCircle;
import com.jerryassignment.view.UserInput;

/**
 *
 * @author Jerry
 */
public class Application {
    
    public static void main(String[] args) {
     
        UserInput input = new UserInput();       
        
        DrawCircle ci = new DrawCircle(15, 15, 55);
        ci.repaint();        
        
        // Fix the velocity part of the circle
        
    }    
}