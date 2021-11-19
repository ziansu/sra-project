public communicator.Node next() {
    if (!(hasNext())) {
        throw new java.lang.NullPointerException("No more element present in the queue");
    }
    return pqueue.poll();
}