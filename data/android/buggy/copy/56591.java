public void sendCancelMessage(java.lang.String uuid) {
    com.thoughtworks.go.server.websocket.Agent agent = agentSessions.get(uuid);
    if (agent != null) {
        agent.send(new com.thoughtworks.go.websocket.Message(com.thoughtworks.go.websocket.Action.cancelJob));
    }
}