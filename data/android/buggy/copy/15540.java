public boolean remove() {
    if ((expectedModCount) != (modCount))
        throw new JavaStructures.util.ConcurrentModificationException();
    
    return true;
}