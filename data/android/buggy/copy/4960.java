@java.lang.Override
public void operationComplete(org.kiteq.remoting.client.impl.ChannelFuture future) throws java.lang.Exception {
    state.set((future.isSuccess() ? org.kiteq.remoting.client.impl.NettyKiteIOClient.STATE.RECOVERING : retryCount > 10 ? org.kiteq.remoting.client.impl.NettyKiteIOClient.STATE.STOP : org.kiteq.remoting.client.impl.NettyKiteIOClient.STATE.RECONNECTING));
}