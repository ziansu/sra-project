public synchronized void setSourceState(int sourceID, int state) {
    sources.get(sourceID).setState(state);
    (gen_sources)++;
}