protected static void keepFile(final java.io.File file) {
    final java.io.File n = new java.io.File(file.getParent(), ((file.getName()) + ".keep"));
    file.renameTo(n);
}