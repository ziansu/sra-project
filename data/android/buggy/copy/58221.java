public void close() throws java.io.IOException {
    lock.writeLock().lock();
    this.f.getFD().sync();
    this.f.close();
    lock.writeLock().unlock();
}