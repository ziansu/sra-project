private void startReaders() throws java.io.FileNotFoundException {
    this.streamReader = new com.inaetics.demonstrator.logging.LogCatReader.LogcatProcessStreamReader(this.inStd, logcatOut);
    streamReader.start();
}