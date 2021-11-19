public void discardCard(guiPacket.Card card) {
    boardController.removeCardFromHand(card);
    boardController.addToPlayerScrapYard(card);
}