public synchronized void remove(java.lang.String id) {
    javaee.bean.ResumeStorage.chunks.remove(id);
    java.lang.System.err.println((("[chunk] " + id) + ": remove success!"));
}