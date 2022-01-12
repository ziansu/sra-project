protected final java.nio.file.Path addTempFile(java.nio.file.Path p) {
    Capsule.log(Capsule.LOG_VERBOSE, ("Creating temp file/dir " + p));
    synchronized(oc.tmpFiles) {
        oc.tmpFiles.add(p);
    }
    return p;
}