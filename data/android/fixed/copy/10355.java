synchronized poker.PlayingCard dealNext() {
    (deal)++;
    poker.PlayingCard toDeal = deck.get(deal);
    return toDeal;
}