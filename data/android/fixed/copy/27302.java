public void setId(int n) {
    if ((n < 999999) && (n > 0)) {
        this.id = n;
    }else {
        throw new java.lang.IllegalArgumentException();
    }
}