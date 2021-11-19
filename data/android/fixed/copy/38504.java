public void uploadFile(java.io.File inputFile) throws java.io.IOException {
    try (java.io.FileInputStream in = new java.io.FileInputStream(inputFile);java.io.OutputStream out = session.getBasicRemote().getSendStream()) {
        org.eclipse.jetty.util.IO.copy(in, out);
    }
}