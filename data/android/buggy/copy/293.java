void state(transaction.TransactionManagerImpl.State state) {
    this.state = state;
    storeLog();
}