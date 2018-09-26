package tictactoe.graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class GameGraphics extends Canvas {

    private ArrayList<Element> elements;//List of all graphics elements to be drawn in insert order.

    public GameGraphics() {
        this.elements = new ArrayList();
    }

    /*
        This method is automatically called when the
        canvas needs to be updated due to a screen
        event like window resizing. It will not,
        however, be called when new graphics elements
        are added. This can be remedied by adding
        this.repaint() in addElement() and clearElements()
        or manually calling repaint() in Game when ready.

        Note: repaint() is not a typo.
     */
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.WHITE);
        for (Element e : elements) {
            e.draw(g);
        }
    }

    public void addElement(Element e) {
        this.elements.add(e);
    }

    public void clearElements() {
        this.elements.clear();
    }

    /* TODO:
        Feel free to add to this implementation.
        Hint: This was all I needed for my solution
     */
}
