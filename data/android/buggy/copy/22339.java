public void close() throws java.io.IOException {
    closeCopy();
    closeIndex();
    super.close();
}