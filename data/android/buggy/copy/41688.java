public java.lang.String getString(int n) {
    if ((n >= 0) && (n < (this.realSize))) {
        return strings[n];
    }
    java.lang.System.out.println("That Index is out of bounds.");
    return null;
}