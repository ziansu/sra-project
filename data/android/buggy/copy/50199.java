private int futuresSize() {
    synchronized(futs) {
        return futs.size();
    }
}