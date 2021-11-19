public boolean isFull() {
    if ((points.size()) >= (NodeArray.NODE_CAPACITY))
        return true;
    
    return false;
}