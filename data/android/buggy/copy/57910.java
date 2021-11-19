public void informClient(java.io.OutputStream out, java.lang.String message) throws java.io.IOException {
    out.write(message.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    out.flush();
}