private void error() {
    try {
        throw new java.lang.IllegalStateException("Something went wrong!");
    } catch (java.lang.IllegalStateException e) {
        de.fred4jupiter.log4j2.demo.LogEntryGenerator.LOG.info(("Exception: Some error occured: " + (e.getMessage())), e);
    }
}