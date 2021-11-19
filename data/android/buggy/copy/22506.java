public boolean checkValidInput(int input) {
    if ((input < 1) | (input > (size))) {
        throw new java.lang.IllegalArgumentException();
        return false;
    }
    return true;
}