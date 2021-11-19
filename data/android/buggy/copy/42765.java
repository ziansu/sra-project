@java.lang.Override
public void afterConnectionClosed(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.CloseStatus status) throws java.lang.Exception {
    cz.cvut.fel.webrtc.UserSession user = registry.removeBySession(session);
}