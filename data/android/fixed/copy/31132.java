public void playFirstCard(Card c, GameCategory gc, Player p) {
    _gameCategory = gc;
    _lastCardPlayed = c;
    p.removeCardFromHand(c);
}