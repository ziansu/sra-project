@java.lang.Override
protected void encode(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf msg, java.util.List<java.lang.Object> out) throws java.lang.Exception {
    out.add(new io.netty.channel.sctp.SctpMessage(streamIdentifier, protocolIdentifier, unordered, msg.retain()));
}