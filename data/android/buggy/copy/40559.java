public byte[] getBytes() {
    if ((bytes) == null) {
        return null;
    }else {
        return bytes.clone();
    }
}