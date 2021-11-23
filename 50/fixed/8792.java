public int getLowestSetBit() {
    if ((sign) == 0) {
        return -1;
    }
    int i = getFirstNonzeroDigit();
    return (i << 5) + (java.lang.Integer.numberOfTrailingZeros(digits[i]));
}