private void swallowFrame(org.apache.catalina.websocket.WebSocketFrame frame) throws java.io.IOException {
    java.io.InputStream payload = frame.getPayload();
    while ((payload.read()) >= 0);
}