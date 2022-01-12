public Item sample() {
    if (this.isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    int index = random();
    return s[index];
}