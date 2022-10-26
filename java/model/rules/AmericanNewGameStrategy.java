package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;

class AmericanNewGameStrategy implements NewGameStrategy {

  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    /*Card.Mutable c;

    c = deck.getCard();
    c.show(true);
    player.dealCard(c);

    c = deck.getCard();         // Remove Duplicate Code 
    c.show(true);
    dealer.dealCard(c);

    c = deck.getCard();
    c.show(true);
    player.dealCard(c);

    c = deck.getCard();
    c.show(false);
    dealer.dealCard(c); */

    player.getShowDeal(deck, true, 2);
    dealer.getShowDeal(deck, true, 1);
    dealer.getShowDeal(deck, false, 1);

    return true;
  }
}