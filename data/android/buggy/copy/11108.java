private int hashFunction(K Key) {
    int hashedIndex = Key.hashCode();
    int sizeOfTable = size();
    if (hashedIndex > sizeOfTable) {
        hashedIndex = (java.lang.Math.abs(hashedIndex)) % sizeOfTable;
    }
    return hashedIndex;
}