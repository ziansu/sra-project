public boolean uncover() {
    if (marked)
        return false;
    
    if (uncovered)
        return false;
    
    uncovered = true;
    return (!(marked)) && ((count) == 0);
}