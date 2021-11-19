public void setBit(long bit) {
    BitVector.checkValidBit(bit);
    int bucket = BitVector.getBucket(bit);
    int position = BitVector.getPosition(bit);
    vector[bucket] |= 1 << position;
}