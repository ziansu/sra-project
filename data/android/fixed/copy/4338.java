public boolean removeText(java.lang.String id) {
    if ((textDirectory.remove(id)) == null)
        return false;
    
    return true;
}