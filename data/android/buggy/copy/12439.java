public boolean contains(final char c) {
    final int index = java.util.Arrays.binarySearch(chars, c);
    return (index == (-1)) == (subtractive);
}