public void setByteIndex(int byteIndex) {
    if ((0 <= byteIndex) && (byteIndex < (getByteSize())))
        bitIndex = byteIndex << 3;
    else
        throw new java.lang.IndexOutOfBoundsException("Setting byte index out of bounds!");
    
}