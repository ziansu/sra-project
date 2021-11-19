private boolean hasNextPackage() {
    return ((currentCount) > 0) || ((byteCache.available()) > 0);
}