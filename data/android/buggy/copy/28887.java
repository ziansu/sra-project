@java.lang.Override
public java.lang.String getHtml(java.nio.file.Path pathToFile) {
    return getHtml(pathToFile.toAbsolutePath().getFileName());
}