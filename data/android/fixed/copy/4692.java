public java.util.List<java.lang.StackTraceElement> getCREStackTrace() {
    if ((this.stackTrace) == null) {
        return new java.util.ArrayList<>();
    }
    return new java.util.ArrayList<>(this.stackTrace);
}