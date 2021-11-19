private int calcHashCode(java.lang.Object splitKey) {
    int hashCode = splitKey.hashCode();
    if (hashCode < 0)
        hashCode = -hashCode;
    
    return hashCode;
}