public void delete(long key) {
    super.delete(key);
    if ((this.atomicKey) != null) {
        this.atomicKey.decrementAndGet();
    }
    (this.key)--;
}