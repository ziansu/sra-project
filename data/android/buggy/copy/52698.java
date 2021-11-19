@java.lang.Override
public java.lang.Object get(int index) {
    if (index <= (size))
        return elements[index];
    
    return new java.lang.IndexOutOfBoundsException("Index is out of bounds!");
}