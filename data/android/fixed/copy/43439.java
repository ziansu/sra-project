public void sendMessage(java.lang.String message) {
    if ((channel) != null) {
        channel.writeAndFlush(new io.netty.handler.codec.http.websocketx.TextWebSocketFrame(message));
    }
}