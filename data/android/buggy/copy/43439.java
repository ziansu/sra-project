public void sendMessage(java.lang.String message) {
    channel.writeAndFlush(new io.netty.handler.codec.http.websocketx.TextWebSocketFrame(message));
}