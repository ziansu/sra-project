protected void RecupereObjet(java.lang.String chemin) throws java.io.IOException {
    java.net.Socket sock = new java.net.ServerSocket(getPort()).accept();
    transfert(sock.getInputStream(), new java.io.FileOutputStream(chemin), true);
    sock.close();
}