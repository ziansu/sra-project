public boolean remove(int index) {
    java.lang.System.arraycopy(elements, (index + 1), elements, index, ((size) - index));
    elements[(--(size))] = null;
    return true;
}