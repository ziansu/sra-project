public int get(int index) throws java.lang.ArrayIndexOutOfBoundsException {
    if ((index < 0) || (index >= (size)))
        throw new java.lang.ArrayIndexOutOfBoundsException("Elemento non trovato");
    
    return elements[index];
}