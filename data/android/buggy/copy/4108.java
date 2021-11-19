public java.io.File getFileSource() {
    java.io.File f = null;
    if ((mTCFile) != null) {
        f = new java.io.File(mTCFile);
        if (f.canRead()) {
            return f;
        }
    }
    return f;
}