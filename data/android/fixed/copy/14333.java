@java.lang.Override
public E peek() {
    if (hasNext()) {
        return arrayLike.get(next);
    }
    throw new java.util.NoSuchElementException("Reached end of iterator.");
}