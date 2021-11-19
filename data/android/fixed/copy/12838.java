public T unqueue() {
    if ((size) != 0) {
        T data = lastNode.data;
        lastNode = lastNode.previousNode;
        (size)--;
        return data;
    }
    return null;
}