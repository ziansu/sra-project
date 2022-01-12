public boolean isIndeterminate() {
    synchronized(this) {
        return indeterminate;
    }
}