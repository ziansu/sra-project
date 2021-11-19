public T get(long selector) {
    int index = ((int) (selector % (elementIndex.length)));
    return elements.get(index);
}