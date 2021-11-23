@java.lang.Override
protected void save(byte[] bytes) {
    try {
        com.techshroom.hendrix.jar.JarData.replaceEntry(new java.io.File(this.sourceJar.getName()), this.entry, bytes);
    } catch (java.io.IOException e) {
        suppress(e);
    }
}