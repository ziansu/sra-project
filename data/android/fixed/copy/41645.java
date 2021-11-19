public boolean isValid(java.lang.Integer number) {
    if (((number != null) && (number >= (minimum))) && (number <= (maximum))) {
        return true;
    }
    return false;
}