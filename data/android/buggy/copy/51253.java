public int[] getData() {
    if (!(this.shouldRead)) {
        return null;
    }
    if (first) {
        return null;
    }
    return data;
}