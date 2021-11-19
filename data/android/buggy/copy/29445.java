public static java.lang.String GetAbsoluteWorkingDirPath() {
    return (java.nio.file.Paths.get("").toAbsolutePath().toString()) + (java.io.File.separator);
}