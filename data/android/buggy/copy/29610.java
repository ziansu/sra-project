public java.lang.String poll() {
    java.lang.String tmp = next;
    next = queue.poll();
    return tmp;
}