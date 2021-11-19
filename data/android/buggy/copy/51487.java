private java.lang.Integer getRightKey(java.lang.Integer key) {
    java.lang.Integer rightKey = key + 1;
    if (rightKey >= ((n) * (n))) {
        return null;
    }
    return rightKey;
}