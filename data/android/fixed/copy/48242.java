@java.lang.Override
public void onClick(android.view.View view) {
    deckEmptyDialog.cancel();
    deck = new com.micste.busdriver.Deck();
    resetGame();
}