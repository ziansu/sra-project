public boolean straightFlush() {
    if ((sameSuit(myCards)) && (inOrder(myCards))) {
        return true;
    }
    return false;
}