private int nextChar() {
    int r;
    if ((r = reader.get()) != (-1))
        return r;
    
    if (EOFFound)
        return -1;
    
    EOFFound = true;
    return '\n';
}