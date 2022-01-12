private void closeSession(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.CloseStatus status) {
    try {
        session.close(status);
    } catch (java.lang.Exception e) {
        logger.warn(e.getMessage(), e);
    }
}