/*
Name: Leo Jiang
Date: 2026-9-23
TurtleInitials.java
This program draws the initials of my full name, with each letter divided into a function for ease of reading.
 */

import java.awt.*;

public class TurtleInitials {
    public static void drawL(Turtle yertle) {
        yertle.penUp();
        yertle.moveTo(50, 150);
        yertle.setPenColor(Color.BLUE);
        yertle.penDown();
        yertle.turn(180);
        yertle.forward(100);
        yertle.turn(-90);
        yertle.forward(50);
        yertle.penUp();
    }

    public static void drawQ(Turtle yertle) {
        yertle.forward(30);
        yertle.turnLeft();
        yertle.forward(50);
        yertle.setPenColor(Color.MAGENTA);
        yertle.penDown();
        yertle.turn(10);
        // Draw circle, logic: 360/10 = 36, so should repeat 36 times, with 10 degree increments, as all degrees in circle is 360
        drawArc(yertle, 360, 10);
        yertle.penUp();
        yertle.turn(90 - yertle.getHeading());
        yertle.forward(52);
        yertle.turn(45);
        yertle.penDown();
        yertle.forward(100);
        yertle.turn(-45);
        yertle.penUp();
    }

    public static void drawJ(Turtle yertle) {
        yertle.moveTo(yertle.getXPos()+30, 150);
        yertle.setPenColor(Color.RED);
        yertle.penDown();
        yertle.forward(100);
        yertle.penUp();
        yertle.turn(180);
        yertle.forward(50);
        yertle.penDown();
        yertle.turn(-90);
        yertle.forward(75);
        // logic: 18 * 10 = 180 perfect for 180 arc
        drawArc(yertle, 180, 5);
    }

    public static void drawArc(Turtle yertle, int degrees, int radius) {
        degrees /= 10;
        for(int i = 0; i < degrees; i++) {
            yertle.forward(radius);
            yertle.turn(10);
        }
    }

    public static void main(String[] args){
        World habitat = new World(500, 500);
        Turtle yertle = new Turtle(habitat);
        // Draw L
        drawL(yertle);
        // Space out for Q
        drawQ(yertle);
        //Draw J
        drawJ(yertle);

    }
}
