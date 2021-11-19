public final boolean exit(int index, eu.verdelhan.ta4j.Decimal price, eu.verdelhan.ta4j.Decimal amount) {
    if (currentTrade.isOpened()) {
        operate(index, price, amount);
        return true;
    }
    return false;
}