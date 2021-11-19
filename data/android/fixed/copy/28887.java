@java.lang.Override
public java.lang.String getHtml(java.nio.file.Path pathToFile) throws java.io.IOException {
    return getHtml(pathToFile.toAbsolutePath().toString());
}