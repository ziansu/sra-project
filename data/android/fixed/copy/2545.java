public synchronized void addSource(final bdv.viewer.SourceAndConverter<?> source) {
    sources.add(bdv.viewer.state.SourceState.create(source, this));
}