public Item sample() {
    if ((count) <= 0)
        throw new java.util.NoSuchElementException();
    
    if ((current) == null) {
        current = first;
    }
    Item result = current.item;
    current = current.next;
    return result;
}