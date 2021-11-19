public T next() {
    if (hasNext()) {
        return ((T) (s.pop()));
    }
}