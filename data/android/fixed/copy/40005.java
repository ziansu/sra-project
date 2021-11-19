public byte[] getValue() {
    if ((value) != null) {
        return value.clone();
    }
    return null;
}