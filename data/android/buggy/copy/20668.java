protected void endJob() {
    try {
        outputStream.write(writeAppender.getLayout().getFooter().getBytes());
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    logger.removeAppender(logName);
}