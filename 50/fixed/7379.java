public java.lang.String createTemp(Scope scope) {
    java.lang.String ret = "t" + (tempCount);
    (tempCount)++;
    return ret;
}