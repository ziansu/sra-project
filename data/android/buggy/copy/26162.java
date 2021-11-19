@javax.websocket.OnOpen
public void onSessionOpened(javax.websocket.Session session) throws java.io.IOException {
    com.whelanlabs.explorer.motion.MovementSystemWebSocket.log.info("onSessionOpened Called. Halting all motion.");
    halt(session);
}