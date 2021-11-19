public boolean add(Cell[][] c) {
    if ((buffer.size()) == (length))
        return false;
    
    buffer.add(c);
    return true;
}