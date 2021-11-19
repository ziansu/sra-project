java.lang.String getStateDescription() {
    synchronized(this) {
        return getRingHandler().getStateDescription();
    }
}