protected void finalize() throws java.lang.Throwable {
    try {
        observableWineprefixes.deleteObserver(this);
    } finally {
        super.finalize();
    }
}