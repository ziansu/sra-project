public void getByteFromPosition(byte[] dst, int k) {
    get(dst, ((((header) - k) + (capacity)) % (capacity)), k);
}