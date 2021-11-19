public java.util.Stack<klondike.entities.Card> getWaste() {
    klondike.entities.Card card = new klondike.entities.Card();
    card.turnOver();
    waste.add(card);
    return waste;
}