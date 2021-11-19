public boolean changeFlag() {
    if (flagged) {
        setEnabled(false);
    }else {
        setEnabled(true);
    }
    flagged = !(flagged);
    return flagged;
}