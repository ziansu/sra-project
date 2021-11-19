private boolean isValue(java.lang.String t) {
    if (t.contentEquals("TRUE"))
        return true;
    
    if (t.contentEquals("FALSE"))
        return true;
    
    return false;
}