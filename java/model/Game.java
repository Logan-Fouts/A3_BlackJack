package model;

import java.util.ArrayList;

/**
 * Represents the entirety of the game. Acts as a Facade to the model.
 */
public class Game {

  private Dealer dealer;
  private Player player;

  /**
   * Constructor that creates a new game instance with a dealer and player.
   */
  public Game() {
    dealer = new Dealer(new model.rules.RulesFactory());
    player = new Player();
  }

  /**
   * Checks if the game has ended.

   * @return true if the game has ended.
   */
  public boolean isGameOver() {
    return dealer.isGameOver();
  }

  /**
   * Checks if the dealer is the winner.

   * @return True if the dealer has won over the player.
   */
  public boolean isDealerWinner() {
    return dealer.isDealerWinner(player);
  }

  /**
   * Stars a new game.

   * @return True if a new game could be started.
   */
  public boolean newGame(controller.Player ctrlPlayer) {
    dealer.addNewSub(ctrlPlayer);
    player.addNewSub(ctrlPlayer);
    return dealer.newGame(player);
  }

  /**
   * Call to let the player get a new card.

   * @return True if the player got a new card.
   */
  public boolean hit() {
    return dealer.hit(player);
  }

  /**
   * Call to let the dealer take cards.

   * @return True if the dealer has the initiaive.
   */
  public boolean stand() {
    return dealer.stand();
  }

  /**
   * Gets the cards currently in the dealer's hand.

   * @return The dealer's cards.
   */
  public Iterable<Card> getDealerHand() {
    return dealer.getHand();
  }

  /**
   * Gets the cards currently in the player's hand.

   * @return The palyer's cards.
   */
  public Iterable<Card> getPlayerHand() {
    return player.getHand();
  }

  /**
   * Returns the score of the dealer's hand.

   * @return the score.
   */
  public int getDealerScore() {
    return dealer.calcScore();
  }

  /**
   * Returns the score of the player's hand.

   * @return the score.
   */
  public int getPlayerScore() {
    return player.calcScore();
  }

}