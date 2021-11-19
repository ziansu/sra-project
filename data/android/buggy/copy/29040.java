public <T extends com.ripple.client.transactions.ManagedTxn.events> int emit(java.lang.Class<T> key, java.lang.Object... args) {
    return publisher.emit(key, args);
}