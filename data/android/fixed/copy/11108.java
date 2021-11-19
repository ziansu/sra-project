private int hashFunction(K Key) {
    int hashedIndex = Key.hashCode();
    int sizeOfTable = size();
    hashedIndex = java.lang.Math.abs(hashedIndex);
    if (hashedIndex > sizeOfTable) {
        hashedIndex = hashedIndex % sizeOfTable;
    }
    return hashedIndex;
}