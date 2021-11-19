private char charAt(int offset) {
    return (bufferChars) != null ? bufferChars[offset] : buffer.charAt(offset);
}