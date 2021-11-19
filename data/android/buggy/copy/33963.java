private void cardBorder(int cardId) {
    cardBorder(((javax.swing.JLabel) (cardsPanel.getComponent(cardId))), cardId);
    cardsPanel.revalidate();
}