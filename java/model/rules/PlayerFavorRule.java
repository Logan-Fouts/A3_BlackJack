package model.rules;

import model.Dealer;
import model.Player;

/** The rule that favors the player if there is a tie. */
public class PlayerFavorRule implements WinStrategy {

  /** Returns true if dealer wins. */  
  public boolean getWinRule(Dealer dealer, Player player, int maxScore) {
    if (dealer.calcScore() > maxScore) {
      return false;
    } else if (player.calcScore() > maxScore) {
      return true;
    } else if (dealer.calcScore() > player.calcScore()) {
      return true;
    } else if (dealer.calcScore() < player.calcScore()) {
      return false;
    }
    return false;     
  }
}
