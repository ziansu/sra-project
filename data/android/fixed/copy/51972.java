public double get(int... keys) throws java.lang.Exception {
    assert (keys.length) == (this.numDimensions);
    int index = findIndex(keys);
    return index < 0 ? 0 : values.get(index);
}