void close() throws java.io.IOException {
    for (com.github.ambry.store.LogSegment segment : segmentsByName.values()) {
        segment.close();
    }
}