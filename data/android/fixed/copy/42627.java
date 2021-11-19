public boolean setByteIndex(int byteIndex) {
    if ((0 <= byteIndex) && (byteIndex <= (getByteSize()))) {
        bitIndex = byteIndex << 3;
        return true;
    }else
        return false;
    
}