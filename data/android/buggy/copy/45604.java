int valueStart(final int i) {
    if (!(match)) {
        throw new java.lang.IllegalStateException("not matched");
    }
    if (i > (captured)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return start[i];
}