public void shutDown() throws java.lang.InterruptedException {
    if ((channel) != null) {
        channel.closeFuture().sync();
    }
    group.shutdownGracefully();
}