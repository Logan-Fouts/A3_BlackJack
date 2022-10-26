package model.rules;

import model.Dealer;
import model.Player;

/** The Basic win rule for the game. */
public class BasicWinRule implements WinStrategy {

  /** Returns true if dealer wins. */  
  public boolean getWinRule(Dealer dealer, Player player, int maxScore) {
    if (player.calcScore() > maxScore) {
      return true;
    } else if (dealer.calcScore() > maxScore) {
      return false;
    }
    return dealer.calcScore() >= player.calcScore();
  }
}
