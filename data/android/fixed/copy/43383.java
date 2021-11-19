public java.lang.String getTimeFormat() {
    synchronized(buffer) {
        return (timeFormat) != null ? timeFormat.toPattern() : null;
    }
}