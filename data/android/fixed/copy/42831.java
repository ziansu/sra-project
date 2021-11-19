public byte[] getCAN() {
    if ((mCAN) == null) {
        return null;
    }
    return mCAN.getData();
}