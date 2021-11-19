public void doTransactionRead(voldemort.performance.benchmark.VoldemortWrapper db) {
    java.lang.Object key = keyProvider.next(insertKeyProvider.lastInt());
    db.read(key, this.value);
}