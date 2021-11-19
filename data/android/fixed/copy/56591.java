public void sendCancelMessage(java.lang.String uuid) {
    if (uuid == null) {
        return ;
    }
    com.thoughtworks.go.server.websocket.Agent agent = agentSessions.get(uuid);
    if (agent != null) {
        agent.send(new com.thoughtworks.go.websocket.Message(com.thoughtworks.go.websocket.Action.cancelJob));
    }
}