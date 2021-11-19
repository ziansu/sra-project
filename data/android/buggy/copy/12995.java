public long append(V val) throws java.lang.Exception {
    long lastPosition = fileSize;
    write(fileSize, val);
    return lastPosition;
}