@java.lang.Override
public long getFilesize() {
    return this.getTrackedFile().getTotalSpace();
}