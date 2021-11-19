public long getBit(int i) {
    return ((getRawBitsShifted()) >> ((getSize()) - (i + 1))) & 1L;
}