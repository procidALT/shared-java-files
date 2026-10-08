/*
Name: Leo Jiang
Class: AP CSA Period 5
Teacher: Stephen Sell
Description: This program creates a turtle canvas, and draws 3 triangles all inside of each other.
 */

public class TurtleTriangles {
    public static void drawTriangle(double angle, int pixels, Turtle turtle) {
        turtle.forward(pixels);
        turtle.turn(angle);
        turtle.forward(pixels);
        turtle.turn(angle);
        turtle.forward(pixels);
        turtle.turn(angle);
    }
    public static void main(String[] args) {
        World habitat = new World(500, 500);
        Turtle yertle = new Turtle(habitat);
        final double angle = -180.0+60.0; // constant
        // draw first triangle
        yertle.penDown();
        yertle.turn(-30.0);
        drawTriangle(angle, 50, yertle);
        drawTriangle(angle, 100, yertle);
        drawTriangle(angle, 150, yertle);

    }
}
