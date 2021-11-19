public boolean canRemove(Card makesRemovable) {
    if ((index) == 0)
        return false;
    
    if (column[index].canRemove(makesRemovable)) {
        return true;
    }
    return false;
}