public boolean hasCard(int num, com.example.james.cardsuite.Card.Suit suit) {
    for (com.example.james.cardsuite.Card card1 : hand) {
        if (card1.equals(new com.example.james.cardsuite.Card(num, suit)))
            return true;
        
    }
    return false;
}