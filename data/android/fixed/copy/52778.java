public synchronized void close() {
    if ((++(streamsDone)) == 2) {
        observer.onCompleted();
    }
}