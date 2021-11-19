private void cardBorder(int cardId) {
    if (cardId < 0)
        return ;
    
    cardBorder(((javax.swing.JLabel) (cardsPanel.getComponent(cardId))), cardId);
    cardsPanel.revalidate();
}