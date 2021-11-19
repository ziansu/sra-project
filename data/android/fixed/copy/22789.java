public java.lang.String GetName(int n) {
    if (((isError) || (n < 0)) || (n >= (names.size())))
        return "";
    
    return names.get(n);
}