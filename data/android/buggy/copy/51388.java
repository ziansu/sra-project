void destroy() {
    for (org.glassfish.grizzly.Connection c : queue) {
        c.close().markForRecycle(true);
    }
    queue.clear();
    queues.remove(this);
}