public java.lang.String getDirections() {
    if ((mDirections) != null) {
        mDirections = decodeString(mDirections);
    }
    return mDirections;
}