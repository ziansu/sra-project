void write(jazmin.server.rpc.RpcMessage message) {
    if ((channel) != null) {
        if ((message.sentTime) == 0) {
            message.sentTime = java.lang.System.currentTimeMillis();
        }
        channel.writeAndFlush(message);
        sentPackageCount.increment();
    }
}