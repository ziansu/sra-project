public int hashCode() {
    int hashCode = 9;
    hashCode ^= ((character) << 21) | ((character) >>> 11);
    return hashCode;
}