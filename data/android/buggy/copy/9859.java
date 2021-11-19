@java.lang.Override
public void select(final int tx, final int ty) {
    if (empty()) {
        Solitaire.discardPile.rebank();
        return ;
    }
    Solitaire.discardPile.addCard(pop());
    java.lang.System.out.println("deckPile select");
}