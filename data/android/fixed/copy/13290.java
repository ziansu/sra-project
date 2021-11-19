public boolean selectCharacter(final int index) {
    if ((index < 0) || ((charList.size()) < (index + 1)))
        return false;
    
    selectedChar = charList.get(index);
    return true;
}