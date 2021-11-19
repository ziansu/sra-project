public boolean isStarving() {
    if ((Food) <= 0) {
        setStarving(true);
    }else {
        setStarving(false);
    }
    return Starving;
}