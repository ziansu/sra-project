private void pile_push_card(final int pile_num, final Card card) {
    Board.Pile this_pile = piles.get(pile_num);
    if (this_pile.pile.empty()) {
        this_pile.suit = card.get_suit();
    }
    this_pile.pile.push(card);
}