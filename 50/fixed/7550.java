private void sleepUntilNewPiece() {
    lock.lock();
    try {
        if (!(newPiece)) {
            cv.awaitUninterruptibly();
        }
        newPiece = false;
    } finally {
        lock.unlock();
    }
}