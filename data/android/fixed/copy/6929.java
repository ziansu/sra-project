void close() {
    if ((lastPage) != null) {
        lastPage.release();
        lastPage = null;
    }
}