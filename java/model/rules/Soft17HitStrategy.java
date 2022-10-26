package model.rules;

import model.Player;

/**
 * If the dealer has a total of 17 but with an Ace as one of their card. The dealer will take another card.
 */
public class Soft17HitStrategy implements HitStrategy {
  private static final int hitLimit = 17;

  /** Returns true if the dealer should hit, and false if the dealer should not hit.*/
  public boolean doHit(Player dealer) {
    if (dealer.calcScore() == hitLimit) {
      for (model.Card card : dealer.getHand()) {
        if (card.getValue() == model.Card.Value.Ace) {
          return true;
        }
      }
    }
    return dealer.calcScore() < hitLimit;
  }
}
