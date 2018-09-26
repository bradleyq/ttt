package tictactoe.graphics;

import java.awt.Graphics;

/*
    This is a basic interface for a graphics element.
    All graphics element have a draw method so they
    should all implement this interface.

    Some Hints for types of Graphics Elements:
      - Grid
      - Marker (X / O)
      - TextBox (For win/cat's game message)
 */
public interface Element {
    void draw(Graphics g);
}
