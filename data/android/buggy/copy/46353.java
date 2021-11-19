public boolean isOutOfWindow(long time) {
    return (time - (timestamp)) > (state.getWindowMs());
}