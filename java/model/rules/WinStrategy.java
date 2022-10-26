package model.rules;

import model.Dealer;
import model.Player;

/** Rule interface for deciding who won. */
public interface WinStrategy {

  /**
  * Encapsulates the winning rules of the game. 

  * @param dealer The dealer to check score of.
  * @param player The player to check score of.
  * @param maxScore The maxScore of the system.
  * @return True if dealer wins, false if player wins.
  */
  boolean getWinRule(Dealer dealer, Player player, int maxScore);
}
