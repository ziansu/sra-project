public final void stopThread() {
    stopped = true;
    queue.notify();
}