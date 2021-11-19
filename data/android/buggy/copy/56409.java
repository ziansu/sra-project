public void setBitIndex(int bitIndex) {
    if ((0 <= bitIndex) && (bitIndex < (getBitSize())))
        this.bitIndex = bitIndex;
    else
        throw new java.lang.IndexOutOfBoundsException("Setting bit index out of bounds!");
    
}