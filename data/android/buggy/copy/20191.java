@java.lang.Override
public void rollback() {
    if (logger.isInfoEnabled()) {
        logger.info("Rolling back transaction...");
    }
    connection.rollback();
    connection.close();
}