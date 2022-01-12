public LLNode<E> removeLast() {
    try {
        LLNode<E> oldLast = last;
        last = null;
        return oldLast;
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}