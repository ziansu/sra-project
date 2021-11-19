@java.lang.Override
public java.util.Iterator<java.lang.Object> iterator() {
    return getReducedChunkValues(readOptions, f, init, bundleSize);
}