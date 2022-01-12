public java.lang.String[] getNames() {
    if ((order.size()) != 0) {
        return order.toArray(new java.lang.String[order.size()]);
    }else {
        return new java.lang.String[0];
    }
}