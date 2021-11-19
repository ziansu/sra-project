public synchronized void removeListener(net.sf.jukebox.sem.EventListener target) {
    if ((listenerSet) == null) {
        throw new java.lang.IllegalArgumentException("null argument");
    }
    listenerSet.remove(target);
}