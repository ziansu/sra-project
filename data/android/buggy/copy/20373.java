public boolean invalidUpdateIndexAtIs(int index, int expectedIndex) {
    return (invalidUpdateIndexes.get(index).intValue()) == expectedIndex;
}