public E get() throws java.io.IOException {
    if (isException()) {
        throw exception;
    }
    return value;
}