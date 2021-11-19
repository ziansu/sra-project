public void alignToNextByte() {
    if ((mBitsPosition) > 0) {
        if ((mBytePosition) == (mBitsData.length)) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        (mBytePosition)++;
        mBitsPosition = 0;
    }
}