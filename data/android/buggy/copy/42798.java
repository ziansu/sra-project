public java.lang.String nextString_Close() {
    next();
    java.lang.String value = getString(1);
    close();
    return value;
}