public int[] keysToArray() {
    int[] keysArr = new int[this.size];
    generateKeysArray(root, keysArr, 0);
    return keysArr;
}