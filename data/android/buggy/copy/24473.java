public boolean add(T newT) {
    if ((list.size()) >= (MAX_SIZE))
        return list.add(newT);
    
    return false;
}