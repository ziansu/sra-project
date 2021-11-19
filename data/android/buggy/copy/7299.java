@java.lang.Override
protected void save(byte[] bytes) {
    try {
        com.techshroom.hendrix.jar.JarData.replaceEntry(this.sourceJar, this.entry, bytes);
    } catch (java.io.IOException e) {
        suppress(e);
    }
}