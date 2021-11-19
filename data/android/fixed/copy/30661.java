private void sendData(java.lang.String dataToSend, java.lang.String sessionId) {
    logger.log(java.util.logging.Level.INFO, ("		Sending data with sessionId:" + sessionId));
    connManager.sendData(sessionId, dataToSend);
}