private void addCard(model.card.ICard card) {
    view.gui.cardDrawer.DrawnCard drawnCard = new view.gui.cardDrawer.DrawnCard(card);
    allDrawnCards.add(drawnCard);
    this.add(drawnCard);
    updateView();
}