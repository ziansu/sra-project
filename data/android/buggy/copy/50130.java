public void writeInt(int startIndex, int length, int[] values) {
    _dataBitSet.writeInt((startIndex * (_numBitsPerValue)), _numBitsPerValue, length, values);
}