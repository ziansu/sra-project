public java.lang.String[] getObjects() {
    if ((list) == null) {
        return null;
    }
    return java.util.Arrays.copyOf(this.ids, this.size);
}