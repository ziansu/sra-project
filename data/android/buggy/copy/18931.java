public void sendToClients(java.lang.String Message) {
    for (java.io.PrintWriter write : this.serverOutput) {
        write.println(Message);
        write.flush();
    }
}