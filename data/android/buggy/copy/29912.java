public boolean isComposite() {
    if ((columnNames) != null) {
        if ((columnNames.length) > 1) {
            return true;
        }
    }
    return false;
}