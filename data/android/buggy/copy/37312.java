@java.lang.Override
protected long getCurrentOffset() throws java.util.NoSuchElementException {
    return this.realOffset ? currentOffset : this.readNum;
}