public Cards.Card draw() {
    if ((deck.size()) > 0) {
        return this.deck.remove(0);
    }else
        return null;
    
}