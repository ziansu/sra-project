public void sendFile(java.lang.String content) {
    send("SOF\n");
    send((content + "\n"));
    send("EOF\n");
}