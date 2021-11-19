public boolean isHeaderShouldBeAppeneded(final java.lang.String fileName) {
    return (isFileShouldBeAddedWithHeader) || ((fileName.contains("\\.")) && (validFormat.contains(fileName.split("\\.")[1])));
}