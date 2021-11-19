public int[] keysToArray() {
    int[] keysArr = new int[this.size];
    if ((this.size) == 0) {
        return keysArr;
    }
    generateKeysArray(root, keysArr, 0);
    return keysArr;
}