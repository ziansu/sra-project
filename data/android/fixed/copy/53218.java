public void dealFour() {
    models.Card tempCard;
    for (int i = 0; i < 4; i++) {
        tempCard = getTopCard(i);
        addCardToCol(i, tempCard);
    }
}