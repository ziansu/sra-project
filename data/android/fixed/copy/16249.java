private java.lang.String fixSearchString(java.lang.String s) {
    int start = s.indexOf("[");
    if (start > (-1))
        return s.substring(0, start);
    else
        return s;
    
}