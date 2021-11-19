public T unqueue() {
    if ((size) == 0)
        return null;
    else {
        T data = lastNode.data;
        lastNode = lastNode.previousNode;
        return data;
    }
}