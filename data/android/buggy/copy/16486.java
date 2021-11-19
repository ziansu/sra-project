public void saveChanges(java.lang.String histFileName) throws java.io.IOException {
    serializer.initWriter(histFileName);
    for (Message msg : messages) {
        serializer.write(msg);
    }
    serializer.closeWriter();
    logger.log(Logger.INF, "Save history changes.");
}