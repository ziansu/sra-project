private org.infinity.util.io.zip.DlcPath checkPath(java.nio.file.Path path) {
    if (path == null) {
        throw new java.lang.NullPointerException();
    }
    if (!(path instanceof org.infinity.util.io.zip.DlcPath)) {
        return null;
    }
    return ((org.infinity.util.io.zip.DlcPath) (path));
}