public chatbot.AgentResponse sendEvent(java.lang.String event, long sessionId, boolean resetContext) {
    return sendQuery(event, "", sessionId, resetContext);
}