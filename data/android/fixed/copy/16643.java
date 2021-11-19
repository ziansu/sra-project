public boolean isHandPlayable() {
    return (BlackJackCardValues.getCombinedValuesOfCardHand(hand)) <= 21;
}