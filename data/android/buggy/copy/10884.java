private java.lang.String publicKeyToString() {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    for (byte b : publicKey) {
        buffer.append(b);
    }
    return buffer.toString();
}