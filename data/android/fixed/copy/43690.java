@java.lang.Override
public void close() throws java.sql.SQLException {
    try {
        connection.rollback();
    } finally {
        sem.unlock();
    }
    logger.fine("Connection returned.");
}