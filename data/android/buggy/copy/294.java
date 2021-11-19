public void incrementSendCounter() {
    if ((++(sendCounter)) == 2) {
        java.lang.System.out.println("D: Will now unlock");
        server.HostedGame.LOCK.lock();
        try {
            server.HostedGame.MOVES_SENT.signal();
        } finally {
            server.HostedGame.LOCK.unlock();
        }
    }
}