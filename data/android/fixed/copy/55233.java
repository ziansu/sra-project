public boolean fullHouse() {
    if ((pair()) && (threeOfAKind())) {
        return true;
    }
    return false;
}