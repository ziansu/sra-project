@java.lang.Override
public void close() {
    this.isClosed = true;
    this.useBegin = false;
    if ((glRenderer) != null) {
        glRenderer.close();
    }
}