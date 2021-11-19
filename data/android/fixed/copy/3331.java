public void addCardAtIndex(com.yan.durak.gamelogic.cards.Card card, int indexOfCard) {
    if (mCardsInPile.contains(card))
        return ;
    
    mCardsInPile.add(indexOfCard, card);
}