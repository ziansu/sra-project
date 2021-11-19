public void join(int timeout, java.util.concurrent.TimeUnit unit) throws net.schmizz.sshj.connection.ConnectionException {
    closeEvent.await(timeout, unit);
}