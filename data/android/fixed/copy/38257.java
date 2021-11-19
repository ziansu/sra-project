public com.Heather.Card dealcard() {
    java.util.Random num = new java.util.Random();
    int r = num.nextInt(theDeck.size());
    com.Heather.Card card = theDeck.remove(r);
    return card;
}