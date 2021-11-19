public void actionPerformed(java.awt.event.ActionEvent arg0) {
    org.magic.api.beans.MagicDeck newDeck = new org.magic.api.beans.MagicDeck();
    setDeck(newDeck);
    deckmodel.init(newDeck);
    deckSidemodel.init(newDeck);
}