package com.jerryassignment.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jerry
 */
public class UserInput {

    private int numberOfCircles;
    private int lowerRangeOfSize;
    private int upperRangeOfSize;

    public UserInput() { }

    public int getNumberOfCircles() {
        return this.numberOfCircles;
    }

    public void determineRangeOfCircle() {
        String rangeOfCircleSizes
                = JOptionPane.showInputDialog(null, "Enter the range of sizes", "Input", JOptionPane.QUESTION_MESSAGE);
    }

    public void combineTwoFieldsAndRetrieveData() {
        // Try JFrame: Create a JFrame, 3 JPanels
        // One panel to hold the Question sign, Second panel holds the labels and 
        // textboxes and the third panel holds the buttons 
        JFrame frame = new JFrame();
        
        JPanel labelsAndTFPanel = new JPanel();
        labelsAndTFPanel.setLayout(new GridLayout(5, 1));
        
        JLabel numberOfCirclesLabel = new JLabel("Enter number of circles");
        JTextField numberOfCirclesTF = new JTextField();
        JLabel rangeOfSizesLabel = new JLabel("Enter the range of sizes");
        JTextField rangeOfSizesTF = new JTextField();
        
        JButton okBtn = new JButton("OK");
        JButton canelBtn = new JButton("Cancel");
        
        labelsAndTFPanel.add(numberOfCirclesLabel);
        labelsAndTFPanel.add(numberOfCirclesTF);
        labelsAndTFPanel.add(rangeOfSizesLabel);
        labelsAndTFPanel.add(rangeOfSizesTF);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okBtn);
        buttonPanel.add(canelBtn);
        
        // Adding panels to the frame
        frame.setLayout(null);
        frame.add(new JPanel());        // Question mark
        frame.add(labelsAndTFPanel);
        frame.add(buttonPanel);
        
    }
}
