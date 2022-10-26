package controller;

import model.Card.Mutable;
import model.Game;
import view.View;


/**
 * Scenario controller for playing the game.
 */
public class Player implements model.CardObserver {
  View view;
  Game game;

  Player(Game game, View view) {
    this.view = view;
    this.game = game;
  }

  /**
   * Runs the play use case.

   * @return True as long as the game should continue.
   */
  public boolean play() {
    view.displayWelcomeMessage();

    view.displayDealerHand(game.getDealerHand(), game.getDealerScore());
    view.displayPlayerHand(game.getPlayerHand(), game.getPlayerScore());

    if (game.isGameOver()) {
      view.displayGameOver(game.isDealerWinner());
    }

    View.Event input = view.getInput();

    if (input == View.Event.Play) {
      game.newGame(this);
    } else if (input == View.Event.Hit) {
      game.hit();
    } else if (input == View.Event.Stand) {
      game.stand();
    }

    return input != View.Event.Quit;
  }

  public void cardDealt(Mutable c, boolean pord) {
    view.excitingDisplayCard(c, pord);
  }
}