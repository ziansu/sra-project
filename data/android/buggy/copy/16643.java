public boolean isHandPlayable() {
    return (BlackJackCardValues.getCombinedValuesOfCardHand(this.hand)) <= 21;
}