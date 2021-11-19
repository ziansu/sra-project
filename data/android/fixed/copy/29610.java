public synchronized java.lang.String poll() {
    queue.poll();
    this.next = this.queue.poll();
    return next;
}