@java.lang.Override
public long getNbBytesRead() {
    return (region) == null ? 0 : region.position();
}