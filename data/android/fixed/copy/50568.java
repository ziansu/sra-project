private void sendToUnity(java.lang.String cmd) throws java.io.IOException {
    out = new java.io.BufferedWriter(new java.io.OutputStreamWriter(socket.getOutputStream()));
    out.write(cmd);
    out.flush();
}