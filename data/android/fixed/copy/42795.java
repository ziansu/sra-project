public void displayDisc(int card, gameEntities.Deck discard) {
    if ((display.size()) == 1)
        return ;
    
    discard.putInto(display.get(card));
    display.remove(card);
}