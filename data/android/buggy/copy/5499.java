public boolean hasSuit(cardsuite.Card.Suit suit) {
    for (cardsuite.Card card : hand) {
        if ((card.getSuit()) == suit) {
            return true;
        }
    }
    return false;
}