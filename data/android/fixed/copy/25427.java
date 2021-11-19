public int getSecondPinCount() {
    if ((getPins().size()) == 1) {
        return 0;
    }
    return getPins().get(1).getCount();
}