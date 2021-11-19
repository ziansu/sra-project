private java.lang.String cutStringUntilTheFirstSpaceIfItExists(java.lang.String s) {
    if (s.contains(" "))
        s = s.substring(0, s.indexOf(" "));
    
    return s;
}