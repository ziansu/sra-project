private boolean isValid(Pile p, Card c) {
    if (p.isEmpty()) {
        return true;
    }
    return (p.checkTop().value) > (c.value) ? false : true;
}