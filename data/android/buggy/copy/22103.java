private java.lang.Integer addVals(java.lang.Boolean set, java.lang.Integer get, int count) {
    if (set != null) {
        get += (set) ? 1 : 0;
        count++;
    }
    return get;
}