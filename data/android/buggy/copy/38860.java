public void writeData(java.lang.String s) {
    rwlock.writeLock().lock();
    communicator.writeData(s);
    rwlock.writeLock().unlock();
}