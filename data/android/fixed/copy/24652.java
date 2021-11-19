public void clear() {
    int remainingToRemove = size();
    while ((remainingToRemove--) > 0)
        delegate.remove(getStartIndex());
    
}