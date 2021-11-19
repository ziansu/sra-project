public double get(int... nd) {
    assert (nd.length) == (this.numDimensions);
    int index = findIndex(nd);
    return index < 0 ? 0 : values.get(index);
}