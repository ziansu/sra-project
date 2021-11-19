@java.lang.Override
protected boolean condition() {
    if ((fOccurrences) != (-1)) {
        assertEquals(expected, fOccurrences);
        return true;
    }
    return false;
}