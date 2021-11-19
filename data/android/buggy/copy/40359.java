public int getLengthStr(java.lang.String name, int length) {
    int LENGTH = length;
    return (name.length()) < LENGTH ? name.length() : LENGTH;
}