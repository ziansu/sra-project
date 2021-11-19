private boolean colHasCards(int colNumber) {
    if ((this.cols.get(colNumber).size()) > 0) {
        return true;
    }
    return false;
}