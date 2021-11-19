public boolean containsSessionId(java.lang.String sessionId) {
    logger.info("In SessionStorage");
    logger.info((("containsSessionId ( " + sessionId) + " )"));
    return storage.contains(sessionId);
}