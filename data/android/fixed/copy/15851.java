public void run() {
    multiPartUpload.uploadPart(new java.io.ByteArrayInputStream(buffer.array()), size);
}