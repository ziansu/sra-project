public void move(int columnFrom, int columnTo) {
    if (not.columnHasCards(columnTo)) {
        this.addCardToCol(columnTo, this.getTopCard(columnFrom));
        this.removeCardFromCol(columnFrom);
    }
}