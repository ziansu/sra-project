private java.lang.Integer addVals(java.lang.Integer set, java.lang.Integer get, int count) {
    if (set != null) {
        get += set;
        count++;
    }
    return get;
}