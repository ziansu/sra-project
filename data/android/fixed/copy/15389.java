@java.lang.Override
protected int getIndex(java.lang.String uuid) {
    return java.util.Arrays.binarySearch(sortedUuids, 0, currentSize, uuid);
}