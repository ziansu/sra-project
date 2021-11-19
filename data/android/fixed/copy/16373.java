@java.lang.Override
public void messageReceived(org.jboss.netty.channel.ChannelHandlerContext ctx, org.jboss.netty.channel.MessageEvent e) throws java.lang.Exception {
    org.jboss.netty.channel.ChannelFuture f = e.getChannel().write(this.getPolicyFileContents());
    f.addListener(ChannelFutureListener.CLOSE);
}