public int reveal() {
    if (!(hasBeenRevealed())) {
        setHasBeenRevealed(true);
        return 1;
    }
    return 0;
}