public boolean hasNext() {
    try {
        queue.peek();
        return true;
    } catch (java.util.NoSuchElementException e) {
        return false;
    }
}