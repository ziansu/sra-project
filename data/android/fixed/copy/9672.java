private boolean isValidInLength(android.text.Editable s) {
    if ((respectPatternLength) && ((s.length()) > (maxLength)))
        return false;
    
    return true;
}