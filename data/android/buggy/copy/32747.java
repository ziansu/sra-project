public int readableData() {
    try {
        return this.input.available();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return -1;
}