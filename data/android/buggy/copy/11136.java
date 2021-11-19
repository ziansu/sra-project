public int[] pop() {
    if ((size) == 0) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return clauses[((size)--)];
}