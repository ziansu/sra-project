@java.lang.Override
public E poll() {
    E item = mInMemoryQueue.poll();
    updateFileStore();
    return item;
}