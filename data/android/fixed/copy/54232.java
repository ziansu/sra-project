private java.lang.String addVals(java.lang.String set, java.lang.String get, int c) {
    if (set != null) {
        get += ("<li>" + set) + "</li>";
        (count[c])++;
    }
    return get;
}