public boolean work(java.lang.String string, java.lang.String type) {
    parseString = string;
    com.gerli.gerli.parser.RemoteParser.stringType = type;
    new java.lang.Thread(sendRunnable).start();
    new java.lang.Thread(recvRunnable).start();
    return true;
}