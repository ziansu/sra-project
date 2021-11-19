public boolean isLost(org.minesweeper.core.Cell selected) {
    boolean lost = hasMine(selected);
    if (lost) {
        reveal(selected);
        revealAll();
    }
    return lost;
}