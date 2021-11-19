public void readInt(int startIndex, int length, int[] buffer) {
    _dataBitSet.readInt((startIndex * (_numBitsPerValue)), _numBitsPerValue, length, buffer);
}