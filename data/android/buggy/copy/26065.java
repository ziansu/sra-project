public java.lang.String getInput() {
    readInput = true;
    if (inputReady) {
        return input;
    }else {
        return null;
    }
}