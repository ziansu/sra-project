public boolean isEmpty() {
    synchronized(prngs) {
        return prngs.isEmpty();
    }
}