public static io.netty.channel.ChannelFuture asyncWriteToEntity(final java.lang.String entity, final java.lang.Object msg) {
    com.zx.sms.connect.manager.EndpointConnector connector = EndpointManager.INS.getEndpointConnector(entity);
    return com.zx.sms.common.util.ChannelUtil.asyncWriteToEntity(connector, msg);
}