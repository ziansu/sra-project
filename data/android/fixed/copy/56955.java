public boolean isTransactional() {
    synchronized(readOnly) {
        return (!(readOnly)) && (transactionsEnabled);
    }
}