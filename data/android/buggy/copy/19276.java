public boolean isEmpty() {
    for (int i = 0; i < (array.length); i++) {
        if ((array[i]) != (DEFAULT_VALUE)) {
            return false;
        }
    }
    return true;
}