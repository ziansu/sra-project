@java.lang.Override
public java.util.Iterator<clojure.lang.IChunk> iterator() {
    return getRecordChunks(readOptions, bundleSize);
}