public boolean hasCard(int num, com.example.james.cardsuite.Card.Suit suit) {
    for (com.example.james.cardsuite.Card card1 : hand) {
        if (card1.equals(num, suit))
            return true;
        
    }
    return false;
}