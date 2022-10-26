package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;


class InternationalNewGameStrategy implements NewGameStrategy {

  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    player.getShowDeal(deck, true, 2);
    dealer.getShowDeal(deck, true, 1);

    return true;
  }
}