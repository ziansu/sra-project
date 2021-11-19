public void setOutputStream(java.io.FileOutputStream outputStream) {
    this.outputStream = outputStream;
    channel = this.outputStream.getChannel();
}