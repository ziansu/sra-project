public int readFromFile() {
    int number = 0;
    try {
        number = this.Reader.nextInt();
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    return number;
}