public void open() throws java.io.IOException {
    in = new java.io.DataInputStream(new java.io.BufferedInputStream(socket.getInputStream()));
    out = new java.io.DataOutputStream(socket.getOutputStream());
    out.writeUTF("Connected");
}