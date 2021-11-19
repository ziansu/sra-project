private static java.nio.file.Path fileToPath(final java.io.File file) {
    try {
        return xyz.enhorse.commons.Validate.notNull("file", file).toPath();
    } catch (java.lang.Exception ex) {
        return xyz.enhorse.commons.HandyPath.DEFAULT_PATH;
    }
}