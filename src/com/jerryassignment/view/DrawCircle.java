package com.jerryassignment.view;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Jerry
 */
public class DrawCircle extends JFrame{

    private static final long serialVersionUID = 1L;
    
    private int numberOfCircle;
    private CircleProps properties;
    
    public DrawCircle(int numberOfCircle, int minRadius, int maxRadius) {
        super("Application");
        this.numberOfCircle = numberOfCircle;
        this.properties = new CircleProps(minRadius, maxRadius);
        setFrameProperties();
    }
    
    public int getNumberOfCircles() {
        return numberOfCircle;
    }
    
    @Override
    public void paint(Graphics g ) {
        super.paintComponents(g);
        g.drawString("Application Title", 40, 50);
        g.drawRect(40, 58, 500, 25);
        for (int i = 1; i <= getNumberOfCircles(); i++) {
            int x = xPosition();
            int y = yPosition();
            int diameter = properties.getRadius() * 2;
            g.drawOval(x, y, diameter, diameter);
            g.setColor(properties.getColor());
            g.fillOval(x, y, diameter, diameter);
        }
    }
    
    private int xPosition() {
        int minimum = 15;
        int value = minimum;
        while (true){
            value = new Random().nextInt(450);
            if (value >= minimum) {
                break;
            }
        }
        return value;
    }
    
        private int yPosition() {
        int minimum = 85;
        int value = minimum;
        while (true){
            value = new Random().nextInt(550);
            if (value >= minimum) {
                break;
            }
        }
        return value;
    }
    
    private void setFrameProperties() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
