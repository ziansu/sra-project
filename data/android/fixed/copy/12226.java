public boolean putSessionId(java.lang.String sessionId) {
    logger.info((("putSessionId( " + sessionId) + " )"));
    return storage.add(sessionId);
}