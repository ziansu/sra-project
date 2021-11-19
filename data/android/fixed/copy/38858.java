public Item last() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("RandomBag is Empty");
    
    return a[((last) - 1)];
}