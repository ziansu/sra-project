private boolean thereIsLinearList(java.lang.Integer[] array) {
    for (java.lang.Integer nodo : array) {
        if (nodo == null) {
            return true;
        }
    }
    return false;
}