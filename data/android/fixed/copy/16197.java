private static java.nio.file.Path getDefaultImportDirectory() {
    final java.nio.file.Path p = magic.utility.MagicFileSystem.getDataPath().getParent().getParent();
    if (p == null) {
        return magic.utility.MagicFileSystem.getDataPath().getParent();
    }
    return p;
}