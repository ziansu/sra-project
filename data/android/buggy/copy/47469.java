public int readFromFile() {
    int number = 0;
    this.Reader.useDelimiter(" ");
    try {
        number = this.Reader.nextInt();
    } catch (java.lang.IndexOutOfBoundsException e) {
        return -1;
    }
    return number;
}