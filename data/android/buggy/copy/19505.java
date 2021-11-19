private boolean doesListContain(char[] array, char c) {
    for (char n : array) {
        if (c == n)
            return true;
        
    }
    return false;
}