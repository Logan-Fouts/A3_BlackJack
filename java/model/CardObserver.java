package model;

/** Works to notify controller if card id dealt. */
public interface CardObserver {
  void cardDealt(Card.Mutable c, boolean pord); 
}
