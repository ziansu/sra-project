protected void finalize() {
    observableWineprefixes.deleteObserver(this);
}