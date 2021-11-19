public Item pop() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("Stack underflow");
    
    Stack<Item>.Node oldFirst = first;
    first = first.next;
    (this.numElements)--;
    return oldFirst.item;
}