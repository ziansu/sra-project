@java.lang.Override
public void shutdown() {
    keepAliveTimer.stop();
    channel.close().awaitUninterruptibly();
    bootstrap.releaseExternalResources();
}