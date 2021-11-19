@java.lang.Override
protected void connect() {
    super.connect();
    sharedSftpClient = connectSftp();
}