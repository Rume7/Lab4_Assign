package com.jerryassignment.view;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Jerry
 */
public class CircleProps {

    private int minRadius;
    private int maxRadius;
    private int velocity;
    private Color[] circleColors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.WHITE,
                                Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW, Color.DARK_GRAY};
    private Random randomNumber = new Random();

    public CircleProps(int minRadius, int maxRadius) {
        this.minRadius = minRadius;
        this.maxRadius = maxRadius;
        this.velocity = (int) (randomNumber.nextInt(minRadius) * Math.random());
    }

    public int getRadius() {
        boolean gottenRadius = false;
        int value = 0;
        while (!gottenRadius) {
            value = randomNumber.nextInt(maxRadius);
            if (value > minRadius) {
                gottenRadius = true;
            }
        }
        return value;
    }
    
    public Color getColor() {
        int index = randomNumber.nextInt(circleColors.length);
        return circleColors[index];
    }

    public int getVelocity() {
        return velocity;
    }
}
