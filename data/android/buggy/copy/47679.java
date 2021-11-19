public void addProperty(int index) {
    if ((((Cards) (hand.get(index))).getID()) < 11) {
        property.add(hand.remove(index));
    }
}