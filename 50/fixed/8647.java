public int containsAce() {
    int count = 0;
    for (com.codeclan.blackjack.Card card : hand) {
        if (card.isAce()) {
            count += 1;
        }
    }
    return count;
}