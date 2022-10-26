package controller;

import model.Game;
import view.EnglishView;
import view.View;

/**
 * Starts the application using the console.
 */
public class App {
  /**
   * Starts the game.

  * @param args Not used.
  */
  public static void main(String[] args) {

    Game g = new Game();
    View v = new EnglishView(); // new SwedishView();
    Player ctrl = new Player(g, v);

    while (ctrl.play()) {

    }
  }
}