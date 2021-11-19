public boolean canDecode(byte[] buffer) {
    compressedStream = buffer;
    boolean canDecode = (internalGetFormat(convertArguments(new java.lang.String[]{  }))) != (-1);
    compressedStream = null;
    return canDecode;
}