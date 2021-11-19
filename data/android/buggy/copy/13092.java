public void closeSession(javax.websocket.Session session, java.lang.String ticket) {
    sessions.remove(session);
    webSocketTicketController.removeTicket(ticket);
}