public boolean checkValidInput(int index) {
    if ((index < 1) | (index > (size))) {
        throw new java.lang.IllegalArgumentException();
    }
    return true;
}