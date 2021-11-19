private static boolean needsCards(java.util.ArrayList<entities.Card> cards, int number) {
    java.lang.System.out.println(("Needs cards: " + (cards.size())));
    return (cards.size()) < number;
}