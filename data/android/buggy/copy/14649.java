@java.lang.Override
public boolean isOpen(int i, int j) {
    validateInput(i);
    validateInput(j);
    java.lang.Integer key = getKey(i, j);
    return isOpen(key);
}