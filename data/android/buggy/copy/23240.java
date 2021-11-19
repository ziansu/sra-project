@java.lang.Override
public synchronized void close() {
    close(0);
    if (!(com.weibo.api.motan.transport.netty.NettyClient.scheduledExecutor.isShutdown()))
        com.weibo.api.motan.transport.netty.NettyClient.scheduledExecutor.shutdown();
    
}