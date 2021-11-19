public models.Card getTopCard(int columnNumber) {
    return this.cols.get(columnNumber).get(((this.cols.get(columnNumber).size()) - 1));
}