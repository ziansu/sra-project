public synchronized boolean isEmpty(org.scribble.sesstype.name.Role peer) {
    java.lang.System.out.println(((("a: " + peer) + ", ") + (this.queues)));
    return this.queues.get(peer).isEmpty();
}