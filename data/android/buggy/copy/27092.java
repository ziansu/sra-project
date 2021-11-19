public void acquire(nachos.threads.PriorityScheduler.PriorityQueue waitQueue) {
    Holding.add(waitQueue);
    setChange();
    if (waitQueue == (Waiting)) {
        waitQueue.waitingQueue.remove(this);
        waitQueue.setChange();
        Waiting = null;
    }
}