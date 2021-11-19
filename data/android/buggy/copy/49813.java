public boolean straightFlush() {
    if ((myCards.sameSuit()) && (myCards.inOrder())) {
        return true;
    }
    return false;
}