public void msend(java.lang.String msg) throws java.io.IOException {
    java.net.Socket sock = createSocket();
    if (!(sendAndReceive(msg)));
    {
        java.lang.System.out.println("Msend failed, try again");
    }
    sock.close();
}