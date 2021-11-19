public boolean remove(int index) {
    java.lang.System.arraycopy(elements, index, elements, (index - 1), ((size) - index));
    elements[(--(size))] = null;
    return true;
}