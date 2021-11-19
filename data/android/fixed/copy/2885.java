private void nextBlank() {
    source.nextChar();
    while (isBlank(source.getChar())) {
        source.nextChar();
    } 
}