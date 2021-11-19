protected void prepareForAdd(long index, int currentArraySize) {
    int intIndex = ((int) (index));
    rangeCheck(index, size);
    ensureCapacity((intIndex + 1), currentArraySize);
    resetSize(intIndex);
}