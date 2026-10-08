/*

 */

import java.awt.Color;

public class TurtleShapeArt {

    /*
    Precondition: Color must be valid color object, Turtle parameter must be a turtle object that has been initialized.
    w and h must not be negative.  Turtle is facing east.
    Post condition: draws a rectangle at the coordinates, with the specified color using the Turtle object passed in.
     */
    public static void drawRect(Color color, Turtle turtle, int w, int h) {
        turtle.setHeading(90);
        turtle.setPenColor(color);
        turtle.penDown();
        // draw the rectangle
        for (int i = 0; i < 2; i++) {
            turtle.forward(w);
            turtle.turnRight();
            turtle.forward(h);
            turtle.turnRight();
        }
        // fill logic
        turtle.forward(w/2);
        turtle.turnRight();
        turtle.setPenWidth(w);
        turtle.forward(h);
        // reset the pen width for next one
        turtle.setPenWidth(1);

        turtle.penUp();
    }
    public static void main(String[] args){
        World habitat = new World(1280, 720);
        Turtle draw = new Turtle(0, 0, habitat);
        Color magenta = new Color(204, 57, 227);
        Color background = new Color(255, 252, 226);
        Color blue = new Color(5, 66, 163);
        Color purple = new Color(129, 29, 204);
        //draw background
        drawRect(background, draw, 1280, 720);
        //draw rectangle at 0, 0
        draw.moveTo(0, 0);
        drawRect(magenta, draw, 100, 720);
        // logging the x and y pos of turtle for debugging
        System.out.println(draw.getXPos() + "," + draw.getYPos());
        draw.moveTo(100, 600);
        drawRect(blue, draw, 350, 200);
        draw.moveTo(350, 0);
        drawRect(purple, draw, 100, 720);

    }
}
