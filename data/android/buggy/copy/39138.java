private java.lang.String withoutFirstLine(java.lang.String s) {
    int i = s.indexOf("\n");
    if (i == (-1))
        return "";
    
    return s.substring(i);
}