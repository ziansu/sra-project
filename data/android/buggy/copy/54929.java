@java.lang.Override
public void commit() {
    if (logger.isInfoEnabled()) {
        logger.info("Commiting transaction...");
    }
    connection.commit();
    connection.close();
}