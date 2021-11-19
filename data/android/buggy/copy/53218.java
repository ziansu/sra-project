public void dealFour() {
    models.Card tempCard = NULL;
    for (i = 0; (i) < 4; (i)++) {
        tempCard = getTopCard(i);
        addCardToCol(i, tempCard);
    }
}