public void stopEmbeddedSftpServer() throws java.lang.InterruptedException {
    if (sshStarted) {
        if ((sshd) != null) {
            sshd.stop();
        }
        sshStarted = false;
    }
}