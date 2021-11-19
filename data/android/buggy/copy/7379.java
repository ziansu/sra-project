public java.lang.String createTemp(Scope scope) {
    while (scope.exists(("t" + (tempCount))))
        (tempCount)++;
    
    java.lang.String ret = "t" + (tempCount);
    (tempCount)++;
    return ret;
}