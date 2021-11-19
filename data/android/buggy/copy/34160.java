private boolean isSuffixEqual(final java.lang.String fileName, final java.lang.String suffix) {
    return fileName.substring(fileName.lastIndexOf('.')).equals(suffix);
}