@java.lang.Override
public void rollbackCurrentTX() throws java.lang.Exception {
    recoverContext();
    try {
        serverSession.rollback(false);
    } finally {
        resetContext();
    }
}