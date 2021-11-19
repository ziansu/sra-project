public boolean EnoughData() {
    if ((ExceptionCounter) > 2) {
        ExceptionCounter = 0;
        return false;
    }else {
        ExceptionCounter = 0;
        return true;
    }
}