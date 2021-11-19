public boolean isUndoTurn() {
    return ((turns.size()) > 0) && (!(matchOver));
}