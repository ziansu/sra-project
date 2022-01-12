public java.util.List<org.scify.memori.card.Card> getMemoriCards(int numOfCards) {
    return shuffleCards(this.cardDBHandlerJSON.getCardsFromDB(numOfCards));
}