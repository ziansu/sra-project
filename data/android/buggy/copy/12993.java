public java.lang.String getToolIdFromEventId(java.lang.String eventId) {
    java.lang.String toolId = M_ers.getEventIdToolMap().get(eventId).getToolId();
    return toolId;
}