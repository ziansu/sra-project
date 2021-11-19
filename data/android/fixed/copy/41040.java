public void close() throws java.io.IOException {
    this.file.getChannel().force(true);
    this.file.close();
}