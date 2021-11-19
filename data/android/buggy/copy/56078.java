@java.lang.Override
public void exceptionCaught(com.lmx.xcall.client.ChannelHandlerContext ctx, java.lang.Throwable cause) throws java.lang.Exception {
    com.lmx.xcall.client.RpcClient.LOGGER.error("client caught exception", cause);
    ctx.close();
}