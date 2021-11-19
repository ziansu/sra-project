public void addCard(Card c) {
    ++(numCards);
    java.lang.System.out.println(numCards);
    hand[((numCards) - 1)] = c;
}