private void mergeDeck(com.wildwebbs.java.Deck d) {
    com.wildwebbs.java.Card card;
    while ((card = d.drawCard()) != null)
        cardDeck.add(card);
    
}