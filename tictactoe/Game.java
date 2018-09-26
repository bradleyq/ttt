package tictactoe;


/*
    This is your main game class. It should contain
    all of the game mechanics and manage the creation
    and destruction of graphics Elements. Ideally,
    however, it will not contain any drawing code
    itself.

    Key features to include:
    - An instance of GameGraphics
    - A 2D array of the game state
    - Any necessary variables to maintain game win and turn status
    - Ways to win a game: X, O, Cat's Game
    - Make sure I can make any size tic tac toe grid

    Helpful classes for the project:
        javax.swing.JFrame
        java.awt.event.MouseListener
        java.awt.Graphics
        java.awt.Canvas (GameGraphics)
 */

public class Game {

    /*TODO:
        This method should start the game. In other words,
        show a window and begin accepting mouse input.
     */
    public void start() {

    }

    /*TODO:
        This should handle all things related to turns
        including creating graphics elements in correct
        locations, updating game state, and checking if
        any player has won the game.
     */
    public void takeTurn(int x, int y) {

    }

    /*TODO:
        Here are some potentially useful helper methods.
        All are optional. Feel free to add/remove/modify
        any of these.
     */
    //checks and returns the winner if one exists.
    private int winCheck() {
        return 0;
    }

    //Converts a pixel coordinate p to index in game board
    //along one axis.
    private int getIndex(int p) {
        return 0;
    }

    //Gets a grid index's position pixel wise on the screen
    private int getPos(int index) {
        return 0;
    }

    //Resets the entire game, graphics, variables, and all.
    private void reset() {
    }
}
